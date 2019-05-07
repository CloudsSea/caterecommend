import * as React from "react";
import { Button,Alert,ButtonToolbar } from 'react-bootstrap';
import Album from "./Album";

class AlertDismissible extends React.Component {
    constructor(props) {
        super(props);

        this.state = { show: true };
    }

    render() {
        const handleHide = () => this.setState({ show: false });
        const handleShow = () => this.setState({ show: true });
        return (
            <ButtonToolbar>
                <Button variant="primary">Primary</Button>
                <Button variant="secondary">Secondary</Button>
                <Button variant="success">Success</Button>
                <Button variant="warning">Warning</Button>
                <Button variant="danger">Danger</Button>
                <Button variant="info">Info</Button>
                <Button variant="light">Light</Button>
                <Button variant="dark">Dark</Button>
                <Button variant="link">Link</Button>
            </ButtonToolbar>
        );
    }
}

export default AlertDismissible;