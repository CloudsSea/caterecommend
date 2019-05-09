import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';
import {Provider} from "mobx-react";
import {Route, Router, Switch} from "react-router";
import {RouterStore, syncHistoryWithStore} from "mobx-react-router";
import createHashHistory from "history/createHashHistory"
import Test from "./component/Test"
import ToDoapp from "./component/ToDoapp";
import Album from "./component/Album";
import Header from "./component/Header";
import Footer from "./component/Footer";
import stores from "./store/Stores"
import FormExample from "./demo/FormExample";
import SignIn from "./component/SignIn";
import Search from "./component/Search";


let rootStore = {}
const hashHistory = createHashHistory()

const routerStore = new RouterStore()
const history = syncHistoryWithStore(hashHistory, routerStore)

routerStore['routing'] = routerStore


ReactDOM.render(
    <Provider {...stores}>
        <Router history={history}>
            <Route component={Header}/>
            <Switch>
                <Route path={"/test"} component={Test}/>
                <Route path={"/bs"} component={ToDoapp}/>
                <Route path={"/form"} component={FormExample}/>
                <Route path={"/login"} component={SignIn}/>
                <Route path={"/search"} component={Search}/>
                <Route path={"/"} component={Album}/>
            </Switch>
            <Route component={Footer}/>
        </Router>


    </Provider>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
