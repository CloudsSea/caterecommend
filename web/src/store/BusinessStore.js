import {observable,computed, action} from 'mobx';
import {types,flow} from 'mobx-state-tree'
class BusinessStore {
    @observable businessList;
    @observable businessDefaultRecommendList;
    @observable businessUserRecommendList;

    constructor() {
        this.fetchTest()
    }

    @action
    changeAge = i => {

    }

    fetchProjects = flow(function * () { // <- 注意*号，这是生成器函数！
        try {
            //const projects = yield getData() // 用 yield 代替 await
            // 异步代码块会被自动包装成动作并修改状态
            //this.state = "success"
            //this.data = projects
            console.log("right")
        } catch (error) {
            console.log("error")
            //this.state = "error"
        }
    })

    @action
    fetchTest(){
        //window.fetch(`http://api.openweathermap.org/data/2.5/weather?appid=${APPID}&q=${this.location}`)
        window.fetch(`restaurant/getlist?optType=2&pageNo=1&pageSize=10`)
            .then(res => res.json())
            .then(action(json => {
                //this.temperatureCelsius = json.main.temp - 273.15
                //this.loading = false
                this.businessList = json.businessList;
                this.businessDefaultRecommendList = json.businessDefaultRecommendList;
                this.businessUserRecommendList = json.businessUserRecommendList;
            }))
    }

}



const businessStore = new BusinessStore()
export default businessStore;