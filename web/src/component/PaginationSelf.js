import * as React from "react";
import './album.css'
import {autobind} from "core-decorators";
import {observer, inject} from "mobx-react";
import {Component} from "react";
import {Button, ToggleButton, Collapse, Pagination, PageItem} from 'react-bootstrap';
import {action} from "mobx";

@inject('paginationStore','businessStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class PaginationSelf extends React.Component {
    items = []
    constructor(props) {
        super(props)
    }

    handleClick(number,e) {
        this.props.paginationStore.handleClick(number)
        this.props.businessStore.fetchBusinessList(number)
    }

    render() {
        this.items = []
        let activeNum = this.props.paginationStore.active;
        let total = this.props.paginationStore.total;
        for (let number = 1; number <= total; number++) {
            this.items.push(
                <Pagination.Item key={number} active={number === activeNum} onClick={this.handleClick.bind(this,number)}>
                    {number}
                </Pagination.Item>,
            );
        }

        // this.props.businessStore.fetchMainPage();
        return (

                <Pagination>{this.items}</Pagination>

        )
    }
}

export default PaginationSelf;