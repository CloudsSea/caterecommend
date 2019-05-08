import * as React from "react";
import './album.css'
import {autobind} from "core-decorators";
import {observer, inject} from "mobx-react";
import {Component} from "react";
import { Button,ToggleButton,Collapse,Pagination,PageItem} from 'react-bootstrap';
import PaginationSelf from "./PaginationSelf";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import {  faCommentAlt,faStar } from '@fortawesome/free-solid-svg-icons'
import { far } from '@fortawesome/free-regular-svg-icons'

@inject('businessStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class Album extends React.Component {
    todosDiv = null;
    todosDivDefaultRecommend = null;
    todosDivUsertRecommend = null;
    constructor(props) {
        super(props)
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

@inject("businessStore")
@autobind
@observer
class Business extends Component {
    constructor(props) {
        super(props)
    }


    render() {
        let index = this.props.index
        let todo = this.props.todos[index]
        let todoPics = todo.photoList;
        let imageShow = null;
        if (0 == todoPics.length) {
            imageShow = <ShowSVG/>
        } else {
            imageShow = <ShowImage imageUrl={todoPics[0].photoId}/>
        }


        return (
            <div className="col-md-4">
                <div className="card mb-4 shadow-sm">

                    {imageShow}

                    <div className="card-body">
                        <p className="card-text">

                            {todo.name}

                        </p>
                        <div className="d-flex justify-content-between align-items-center">

                            <div className="btn-group">
                                <button type="button"
                                        className="btn btn-sm btn-outline-secondary">View
                                </button>
                                <button type="button"
                                        className="btn btn-sm btn-outline-secondary">Book
                                </button>
                            </div>


                            <small className="text-muted"> <GetStars starNum={todo.stars}/>&nbsp;&nbsp;&nbsp;&nbsp;<FontAwesomeIcon icon={faCommentAlt} />{todo.reviewCount} </small>

                        </div>
                    </div>
                </div>
            </div>
        )
    }


}

function GetStars(props){
    let starNum = props.starNum;
    let items = [];
    for(var i=5;i>=1;i--){
        if(i <= starNum){
            items.push( <FontAwesomeIcon  icon={faStar}/>);
        }else{
            // items.push( <FontAwesomeIcon icon={['far', 'Star']}/>);
        }
    }
    console.log(items)
    return items;
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
function BusinessList(props) {
    if (null != props.todosDiv) {
        return (
            <div>
                <hr/>
                <h2>RESTAURANT LIST</h2>
                <hr/>
                <div className="row">
                    {props.todosDiv}

                    <PaginationSelf/>
                    {/*<Pagination>*/}
                    {/*<Pagination.First />*/}
                    {/*<Pagination.Prev />*/}
                    {/*<Pagination.Item>{1}</Pagination.Item>*/}
                    {/*<Pagination.Ellipsis />*/}

                    {/*<Pagination.Item>{10}</Pagination.Item>*/}
                    {/*<Pagination.Item>{11}</Pagination.Item>*/}
                    {/*<Pagination.Item active>{12}</Pagination.Item>*/}
                    {/*<Pagination.Item>{13}</Pagination.Item>*/}
                    {/*<Pagination.Item disabled>{14}</Pagination.Item>*/}

                    {/*<Pagination.Ellipsis />*/}
                    {/*<Pagination.Item>{20}</Pagination.Item>*/}
                    {/*<Pagination.Next />*/}
                    {/*<Pagination.Last />*/}
                    {/*</Pagination>*/}
                </div>
            </div>
        )
    }else{
        return null;
    }
}

function  ShowImage(props) {
    return (
        <img className="bd-placeholder-img card-img-top"  width="100%" height="225"
             src={props.imageUrl}/>
    );
}
function ShowSVG() {
    return (
        <svg className="bd-placeholder-img card-img-top" width="100%" height="225"
             xmlns="http://www.w3.org/2000/svg" aria-label="Placeholder: Thumbnail"
             preserveAspectRatio="xMidYMid slice" role="img"><title>Placeholder</title>
            <rect width="100%" height="100%" fill="#55595c"></rect>
            <text x="40%" y="50%" fill="#eceeef" dy=".3em">no photo </text>
        </svg>
    );
}

export default Album;


