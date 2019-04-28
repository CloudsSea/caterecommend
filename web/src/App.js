import React, {Component} from 'react';
import './App.css';
import logo from './logo.svg';
import {inject, observer} from "mobx-react";
import {autobind} from "core-decorators";
import {Row, Col, ButtonToolbar, Button} from 'react-bootstrap';

@inject("app")
@autobind
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
                <p>abc</p>
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                </header>

                    <Row className="show-grid">
                        <Col xs={12} md={4}>
                            <p className="App-intro">
                                Buttons Demo
                            </p>
                        </Col>
                        <Col xs={6} md={8}>
                            <ButtonToolbar>
                                {/* Standard button */}
                                <Button>Default</Button>

                                {/* Provides extra visual weight and identifies the primary action in a set of buttons */}
                                <Button bsStyle="primary">Primary</Button>

                                {/* Indicates a successful or positive action */}
                                <Button bsStyle="success">Success</Button>

                                {/* Contextual button for informational alert messages */}
                                <Button bsStyle="info">Info</Button>

                                {/* Indicates caution should be taken with this action */}
                                <Button bsStyle="warning">Warning</Button>

                                {/* Indicates a dangerous or potentially negative action */}
                                <Button bsStyle="danger">Danger</Button>

                                {/* Deemphasize a button by making it look like a link while maintaining button behavior */}
                                <Button bsStyle="link">Link</Button>
                            </ButtonToolbar>
                        </Col>
                    </Row>

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
