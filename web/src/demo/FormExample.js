
import * as React from "react";
import $ from  'jquery'

import { Button,Form,InputGroup,Col,Pagination,PageItem} from 'react-bootstrap';


class FormExample extends React.Component {
    constructor(...args) {
        super(...args);

        this.state = { validated: false };
    }

    handleSubmit(event) {
        //两种form提交
        const form = event.currentTarget;


        let formData = new FormData($("#userForm")[0]);  // 定位到userForm表单，并将表单定位转为FormData对象
        console.log(formData)
        return null;
        $.ajax({
            url: '/add',   //网络请求url地址
            type: 'POST',
            data: formData, //表单数据
            cache: false,
            contentType: false,  //或者 contentType:multipart/form-data均可以，multipart/form-data表示可以上传下载文件（既可以发送文本数据，也支持二进制数据上载），表明传输的数据要用到多媒体传输协议，由于多媒体传输的都是大量的数据，所以规定上传文件必须是post方法；contentType默认为application/x-www-form-urlencoded不能上传文件
            processData: false,
            success: function (data) {
                console.log('成功');
            }.bind(this),
            error: function (xhr, status, err) {
            }.bind(this)
        });



        if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
        }
        this.setState({ validated: true });

        // let url = '';
        // var formData = new FormData();
        // formData.append("username", "小明");
        // formData.append("userage", 12);
        // fetch(url,{
        //     method: 'post',
        //     body: ,
        // }).then(function (res) {
        //     return res.json();
        // }).then(function (json) {
        //     if (json.code == "200") {
        //         console.log("232323233-----正确")
        //     }else if (json.code == "400") {
        //         console.log("2323232323------错了～")
        //     }
        // })
    }

    render() {
        const { validated } = this.state;
        return (
            <Form
                id="userForm"
                noValidate
                validated={validated}
                onSubmit={e => this.handleSubmit(e)}
            >
                <Form.Row>

                    <Form.Group as={Col} md="4" controlId="validationCustom02">
                        <Form.Label>Last name</Form.Label>
                        <Form.Control
                            required
                            type="text"
                            placeholder="Last name"
                            defaultValue="Otto"
                        />
                        <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                    </Form.Group>
                    <Form.Group as={Col} md="4" controlId="validationCustomUsername">
                        <Form.Label>Username</Form.Label>
                        <InputGroup>
                            <InputGroup.Prepend>
                                <InputGroup.Text id="inputGroupPrepend">@</InputGroup.Text>
                            </InputGroup.Prepend>
                            <Form.Control
                                type="text"
                                placeholder="Username"
                                aria-describedby="inputGroupPrepend"
                                required
                            />
                            <Form.Control.Feedback type="invalid">
                                Please choose a username.
                            </Form.Control.Feedback>
                        </InputGroup>
                    </Form.Group>
                </Form.Row>

                <Form.Group>
                    <Form.Check
                        required
                        label="Agree to terms and conditions"
                        feedback="You must agree before submitting."
                    />
                </Form.Group>
                <Button type="submit">Submit form</Button>
            </Form>
        );
    }
}


export default FormExample;
