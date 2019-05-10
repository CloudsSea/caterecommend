import * as React from "react";
import './album.css'
import { Button,ButtonGroup,ToggleButton,Collapse   } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import {  faUserAlt,faStar,faSignOutAlt } from '@fortawesome/free-solid-svg-icons'
import {observer, inject} from "mobx-react";
import {autobind} from "core-decorators";
import $ from "jquery"
@inject('businessStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class Header extends React.Component{
    constructor(props, context) {
        super(props, context);

        this.state = {
            open: false,
        };
    }

    render() {
        const { open } = this.state;
        return(

        <div>
            <header className="bg-dark">
                <Collapse in={this.state.open}>
                    <div className="container" id="example-collapse-text">
                        <div className="row">
                            <div className="col-sm-8 col-md-7 py-4">
                                <h4 className="text-white">About</h4>
                                <p className="text-muted">Add some information about the album below, the author, or any
                                    other background context. Make it a few sentences long so folks can pick up some
                                    informative tidbits. Then, link them off to some social networking sites or contact
                                    information.</p>
                            </div>
                            <div className="col-sm-4 offset-md-1 py-4">
                                <h4 className="text-white">Contact</h4>
                                <ul className="list-unstyled">
                                    <li><a href="#" className="text-white">Follow on Twitter</a></li>
                                    <li><a href="#" className="text-white">Like on Facebook</a></li>
                                    <li><a href="#" className="text-white">Email me</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </Collapse>
                <div className="navbar navbar-dark bg-dark shadow-sm">
                    <div className="container d-flex justify-content-between">
                        <a href="#" className="navbar-brand d-flex align-items-center">
                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none"
                                 stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                 aria-hidden="true" className="mr-2" viewBox="0 0 24 24">
                                <path
                                    d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"/>
                                <circle cx="12" cy="13" r="4"/>
                            </svg>
                            <strong>Album</strong>
                        </a>
                        <ButtonGroup>
                            <Button
                                onClick={() => this.setState({ open: !open })}
                                aria-controls="example-collapse-text"
                                aria-expanded={open}
                            >
                                <span className="navbar-toggler-icon"></span>
                            </Button >

                            <Button
                                onClick={() => this.props.history.push('/login')}
                            >
                                <FontAwesomeIcon icon={faUserAlt} />
                            </Button >
                            <Button
                                onClick={() =>
                                    $.ajax({
                                    url: '/login/loginout.do',   //网络请求url地址
                                    type: 'POST',
                                    cache: false,
                                    contentType: false,  //或者 contentType:multipart/form-data均可以，multipart/form-data表示可以上传下载文件（既可以发送文本数据，也支持二进制数据上载），表明传输的数据要用到多媒体传输协议，由于多媒体传输的都是大量的数据，所以规定上传文件必须是post方法；contentType默认为application/x-www-form-urlencoded不能上传文件
                                    processData: false,
                                    success: function (data) {
                                        console.log('成功');
                                        this.props.businessStore.fetchMainPage();
                                        this.props.history.push('/album');
                                    }.bind(this),
                                    error: function (xhr, status, err) {
                                    }.bind(this)
                                })}
                            >
                                <FontAwesomeIcon icon={faSignOutAlt} />
                            </Button >
                        </ButtonGroup>
                    </div>
                </div>
            </header>
        </div>
        )
    }
}
export default Header;