import * as React from "react";
import './signin.css'
import {inject, observer} from "mobx-react";
import {autobind} from "core-decorators";
import signInStore from "../store/SignInStore";

@inject('signInStore')
@autobind //@autobind 将组件之间的绑定自动完成
@observer
class SignIn extends React.Component {
    render() {
        return (
            <form className="form-signin">
                <img className="mb-4" src="" alt="" width="72" height="72"/>
                <h1 className="h3 mb-3 font-weight-normal">Please sign in</h1>
                <label htmlFor="inputEmail" className="sr-only">Email address</label>
                <input type="email" id="inputEmail" className="form-control" placeholder="Email address" required
                       autoFocus/>
                <label htmlFor="inputPassword" className="sr-only">Password</label>
                <input type="password" id="inputPassword" className="form-control" placeholder="Password" required/>
                <div className="checkbox mb-3">
                    <label>
                        <input type="checkbox" value="remember-me"/> Remember me
                    </label>
                </div>
                <button className="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                <p className="mt-5 mb-3 text-muted">2017</p>
            </form>
        )
    }
}

export default SignIn;