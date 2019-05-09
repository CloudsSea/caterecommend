import * as React from "react";
import './album.css'
import {Button, ToggleButton, Collapse} from 'react-bootstrap';
import {inject, observer} from "mobx-react";
import {autobind} from "core-decorators";
import Business from "./Album.Business"


@inject('businessStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class Search extends React.Component {
    todosDiv = null;

    constructor(props, context) {
        super(props, context);

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
                            <h1 className="jumbotron-heading">Album example</h1>
                            <p className="lead text-muted">Something short and leading about the collection below—its
                                contents, the creator, etc. Make it short and sweet, but not too short so folks don’t
                                simply skip over it entirely.</p>
                            <p>
                                <a href="#" className="btn btn-primary my-2">Main call to action</a>
                                <a href="#" className="btn btn-secondary my-2">Secondary action</a>
                            </p>
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