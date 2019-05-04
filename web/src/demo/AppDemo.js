// AppDemo
const AppDemo = observer(({ temperatures }) => (
    <ul>
        <TemperatureInput temperatures={temperatures} />
        {temperatures.map(t =>
            <TView key={t.id} temperature={t} />
        )}
        <DevTools/>
    </ul>
))

ReactDOM.render(
    <AppDemo temperatures={temps}/>,
    document.getElementById('root')
)