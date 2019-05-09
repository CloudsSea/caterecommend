import * as React from "react";
import './album.css'
import {autobind} from "core-decorators";
import {observer, inject} from "mobx-react";
import {Component} from "react";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import {  faCommentAlt,faStar } from '@fortawesome/free-solid-svg-icons'
import { far } from '@fortawesome/free-regular-svg-icons'
import PaginationSelf from "./PaginationSelf";

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

export function BusinessList(props) {
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



export default  Business;