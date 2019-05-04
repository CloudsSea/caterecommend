import * as React from "react";
import './album.css'
import {autobind} from "core-decorators";
import {observer,inject} from "mobx-react";
import {getSearchData} from "../api/apis"
import {Component} from "react";

@inject('businessStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class Album extends React.Component {
    constructor(props) {
        super(props)
    }

    render() {
        // let todos = this.props.businessStore.businessList;
        let todos = this.props.businessStore.businessDefaultRecommendList;
        let todosDiv = todos.map((item, index) => {
            return (<Business index={index}/>)
        })
        // this.props.businessStore.fetchTest();
        return (

            <div>
                <main role="main">
                    <section className="jumbotron text-center">
                        <div className="container">
                            <h1 className="jumbotron-heading">Album example</h1>
                            <p className="lead text-muted">Something short and leading about the collection below—its
                                contents, the creator, etc. Make it short and sweet, but not too short so folks don’t
                                simply skip over it entirely.</p>
                            <p>
                                <a href="#" className="btn btn-primary my-2">Main call to action</a>
                                <a href="#" className="btn btn-secondary my-2" >Secondary action</a>
                            </p>
                        </div>
                    </section>


                    <div className="album py-5 bg-light">
                        <div className="container">

                            <div className="row">

                                {todosDiv}

                            </div>
                        </div>
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


    showImage(props) {
        return (
            <img src={props.imageUrl}/>
        );
    }
    showSVG() {
        return (
            <svg className="bd-placeholder-img card-img-top" width="100%" height="225"
                 xmlns="http://www.w3.org/2000/svg" aria-label="Placeholder: Thumbnail"
                 preserveAspectRatio="xMidYMid slice" role="img"><title>Placeholder</title>
                <rect width="100%" height="100%" fill="#55595c"></rect>
                <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
            </svg>
        );
    }

    render() {
        let index = this.props.index
        let todo = this.props.businessStore.businessDefaultRecommendList[index]
        let todoPics = this.props.businessStore.businessDefaultRecommendList[index].photoList;
        let imageShow = null;
        if(0 == todoPics.length){
            imageShow = this.showSVG()
        }else{
            imageShow = this.showImage({imageUrl:todoPics[0]})
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
                                        className="btn btn-sm btn-outline-secondary">Edit
                                </button>
                            </div>
                            <small className="text-muted">9 mins</small>
                        </div>
                    </div>
                </div>
            </div>
        )
    }




}

export default Album;


