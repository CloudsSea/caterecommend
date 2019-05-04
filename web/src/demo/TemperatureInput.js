@observer
class TemperatureInput extends React.Component {
    @observable input = ''
    render () {
        return (
            <li>
                Destination
                <input value={this.input}
                       onChange={this.onChange}/>
                <button onClick={this.onSubmit}>Add</button>
            </li>
        )
    }
    @action onChange = e => {
        this.input = e.target.value
    }

    @action onSubmit = () => {
        this.props.temperatures.push(new Temperature(this.input))
        this.input = ''
    }
}