import React, {Component} from 'react';
import './App.css';
import logo from './logo.svg';
import {inject, observer} from "mobx-react";
import {autobind} from "core-decorators";

@inject("app")  //@inject("app")表示注入在index.js中的rootStore的属性app。是由<Provider {...rootStore}>这个标签来实现动态的注入的
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class App extends Component {
    constructor(props) {
        super(props)
    }

    render() {
        let todos = this.props.app.todos
        let todosDiv = todos.map((item, index) => {
            return (<Todo index={index}/>)
        })
        return (
            <div className="App">
                {todosDiv}
            </div>
        );
    }
}

@inject("app")
@autobind
@observer
class Todo extends Component {
    constructor(props) {
        super(props)
    }

    handleClick() {
        let index = this.props.index
        this.props.app.handleClick(index)
    };

    render() {
        let index = this.props.index
        let todo = this.props.app.todos[index]
        return (
            <p><input type={'checkbox'} checked={todo.checked} onClick={this.handleClick}/>
                {todo.text}:{index}
            </p>
        )

    }
}


export default App;
