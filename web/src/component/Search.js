import * as React from "react";
import './album.css'
import {Button, ToggleButton, Collapse} from 'react-bootstrap';
import {inject, observer} from "mobx-react";
import {autobind} from "core-decorators";
import Business from "./Business";
import  {BusinessList} from './Business'




@inject('businessStore','searchStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class Search extends React.Component {
    todosDiv = null;
    constructor(props, context) {
        super(props, context);
    }
    onSearchText(text){
        this.props.businessStore.fetchBusinessList(text,1)
    }
    handleEnterKey = (e) =>{
        if(e.nativeEvent.keyCode === 13){ //e.nativeEvent获取原生的事件对像
            this.onSearchText(e.target.value)
        }
    }
    render() {
        let todos = this.props.businessStore.businessList;
        if (null != todos) {
            this.todosDiv = todos.map((item, index) => {
                return (<Business key={index} index={index} todos={todos}/>)
            })
        } else {
            this.todosDiv = null;
        }


        return (
            <div>
                <main role="main">
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

                            <BusinessList todosDiv={this.todosDiv}/>

                        </div>
                        <hr/>
                    </div>


                </main>


            </div>


        )
    }
}

export default Search;