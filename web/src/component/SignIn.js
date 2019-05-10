import * as React from "react";
import './signin.css'
import {inject, observer} from "mobx-react";
import {autobind} from "core-decorators";
import $ from "jquery"



@inject('signInStore','businessStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class SignIn extends React.Component {
    constructor(props) {
        super(props)
    }

    handleSubmit(event) {
        //两种form提交
        const form = event.currentTarget;
        let formData = new FormData($("#loginForm")[0]);  // 定位到userForm表单，并将表单定位转为FormData对象
        console.log(formData)
        $.ajax({
            url: '/login/login.do',   //网络请求url地址
            type: 'POST',
            data: formData, //表单数据
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
        });
    }


    render() {
        return (
            <div id="loginDiv">
                <form id="loginForm" className="form-signin">
                    <img className="mb-4" src="http://spark.apache.org/images/spark-logo-trademark.png" alt="" width="72" height="72"/>
                    <h1 className="h3 mb-3 font-weight-normal">Please sign in</h1>
                    <label htmlFor="inputEmail" className="sr-only">Email address</label>
                    <input type="input" name="userName" id="inputEmail" className="form-control" placeholder="userName"
                           required
                           autoFocus/>
                    <label htmlFor="inputPassword" className="sr-only">Password</label>
                    <input type="password" id="inputPassword" name="password" className="form-control"
                           placeholder="Password" required/>
                    <div className="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me"/> Remember me
                        </label>
                    </div>
                    <button className="btn btn-lg btn-primary btn-block" type="button"
                            onClick={e => this.handleSubmit(e)}>Sign in
                    </button>
                    <p className="mt-5 mb-3 text-muted">© 2017-2019</p>
                </form>
            </div>
        )
    }
}

export default SignIn;