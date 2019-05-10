import * as React from "react";
import './album.css'
import {autobind} from "core-decorators";
import {observer, inject} from "mobx-react";
import  Business from './Business'
import  {BusinessList} from './Business'

@inject('businessStore','searchStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class Album extends React.Component {
    todosDiv = null;
    todosDivDefaultRecommend = null;
    todosDivUsertRecommend = null;
    constructor(props) {
        super(props)
    }
    onSearchText(text){
        this.props.businessStore.fetchBusinessList(text,1)
        this.props.history.push('/search');
        this.props.searchStore.keywords = text;
    }
    handleEnterKey = (e) =>{
        if(e.nativeEvent.keyCode === 13){ //e.nativeEvent获取原生的事件对像
            this.onSearchText(e.target.value)
        }
    }


    render() {
        // let todos = this.props.businessStore.businessList;
        let todos = this.props.businessStore.businessList;
        let todosDefaultRecommend = this.props.businessStore.businessDefaultRecommendList;
        let todosUserRecommend = this.props.businessStore.businessUserRecommendList;

        if(null != todos){
            this.todosDiv = todos.map((item, index) => {
                return (<Business key={index} index={index} todos={todos}/>)
            })
        }else{
            this.todosDiv = null;
        }
        if(null != todosDefaultRecommend){
            this.todosDivDefaultRecommend = todosDefaultRecommend.map((item, index) => {
                return (<Business key={index} index={index} todos={todosDefaultRecommend}/>)
            })
        }else{
            this.todosDivDefaultRecommend = null;
        }
        if(null != todosUserRecommend){
            this.todosDivUsertRecommend = todosUserRecommend.map((item, index) => {
                return (<Business key={index} index={index} todos={todosUserRecommend}/>)
            })
        }else{
            this.todosDivUsertRecommend = null;
        }
        // this.props.businessStore.fetchMainPage();
        return (
            <div>
                <main role="main">
                    {/*<section className="jumbotron text-center">*/}
                        {/*<div className="container">*/}
                            {/*<h1 className="jumbotron-heading">Album example</h1>*/}
                            {/*<p className="lead text-muted">Something short and leading about the collection below—its*/}
                                {/*contents, the creator, etc. Make it short and sweet, but not too short so folks don’t*/}
                                {/*simply skip over it entirely.</p>*/}
                            {/*<p>*/}
                                {/*<a href="#" className="btn btn-primary my-2">Main call to action</a>*/}
                                {/*<a href="#" className="btn btn-secondary my-2">Secondary action</a>*/}
                            {/*</p>*/}
                        {/*</div>*/}
                    {/*</section>*/}
                    <section className="jumbotron text-center">
                        <div className="container">
                            {/* <h1 className="jumbotron-heading">Album example</h1>
                            <p className="lead text-muted">Something short and leading about the collection below—its
                                contents, the creator, etc. Make it short and sweet, but not too short so folks don’t
                                simply skip over it entirely.</p>
                            <p>
                                <a href="#" className="btn btn-primary my-2">Main call to action</a>
                                <a href="#" className="btn btn-secondary my-2">Secondary action</a>
                            </p>*/}




                            <input className="form-control search-input" type="text" placeholder={this.props.searchStore.keywords} aria-label="Search"
                                    onKeyPress={this.handleEnterKey}/>
                        </div>
                    </section>

                    <div className="album py-5 bg-light">
                        <div className="container">

                            <RecommendDefault todosDivDefaultRecommend={this.todosDivDefaultRecommend}/>
                            <RecommendUser todosDivUsertRecommend={this.todosDivUsertRecommend} />
                            <BusinessList  todosDiv={this.todosDiv}/>


                        </div>
                        <hr/>
                    </div>


                </main>


            </div>

        )
    }
}








function RecommendDefault(props) {
    if (null != props.todosDivDefaultRecommend) {
        return (
            <div>
                <hr/>
                <h2>DEFAULT RECOMMEND</h2>
                <hr/>
                <div className="row">
                    {props.todosDivDefaultRecommend}

                </div>
            </div>
        )
    }else{
        return null;
    }
}
function RecommendUser(props) {
    if (null != props.todosDivUsertRecommend) {
        return (
            <div>
                <hr/>
                <h2>PERSONAL RECOMMEND</h2>
                <hr/>
                <div className="row">
                    {props.todosDivUsertRecommend}

                </div>
            </div>
        )
    }else{
        return null;
    }
}


export default Album;


