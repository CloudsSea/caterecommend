@observer
class TView extends React.Component {
    render () {
        const t = this.props.temperature
        return (
            <li key={t.id} onClick={() => this.onTemperatureClick()}>{t.location}: {t.loading ? 'loading...' : t.temperature}</li>
        )
    }

    @action onTemperatureClick = () => {
        this.props.temperature.inc()
    }
}