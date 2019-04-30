import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import {Provider} from "mobx-react";
import AppStore from './store/AppStore'
import {Route, Router, Switch} from "react-router";
import {RouterStore, syncHistoryWithStore} from "mobx-react-router";
import createHashHistory from "history/createHashHistory"
import Test from "./component/Test"
import ToDoapp from "./component/ToDoapp";


let rootStore = {}
const hashHistory = createHashHistory()

const routerStore = new RouterStore()
const history = syncHistoryWithStore(hashHistory, routerStore)
rootStore['app'] = new AppStore()
routerStore['routing'] = routerStore

ReactDOM.render(
    <Provider {...rootStore}>
        <Router history={history}>
            <p>here is the menu</p>
            <Switch>
                <Route path={"/test"} component={Test}/>
                <Route path={"/bs"} component={ToDoapp}/>
                <Route path={"/"} component={App}/>
            </Switch>

        </Router>

    </Provider>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
