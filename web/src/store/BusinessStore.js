import {observable,computed, action} from 'mobx';
import {types,flow} from 'mobx-state-tree'
class BusinessStore {
    @observable businessList;
    @observable businessDefaultRecommendList;
    @observable businessUserRecommendList;

    constructor() {
        this.fetchMainPage()
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
    fetchMainPage(optType, userId){
        //window.fetch(`http://api.openweathermap.org/data/2.5/weather?appid=${APPID}&q=${this.location}`)
        let reqUrl = null;
        if(null == userId){
            reqUrl = 'restaurant/getlist.do?&pageNo=1&pageSize=12';
        }else{
            reqUrl = 'restaurant/getlist.do?optType=5&userId='+userId+'&pageNo=1&pageSize=12';
        }
        window.fetch(reqUrl)
            .then(res => res.json())
            .then(action(json => {
                //this.temperatureCelsius = json.main.temp - 273.15
                //this.loading = false
                this.businessList = json.businessList;
                this.businessDefaultRecommendList = json.businessDefaultRecommendList;
                this.businessUserRecommendList = json.businessUserRecommendList;
            }))
    }

    @action
    fetchBusinessList(name,number){
        //window.fetch(`http://api.openweathermap.org/data/2.5/weather?appid=${APPID}&q=${this.location}`)
        window.fetch(`restaurant/getlist.do?businessName=${name}&optType=1&pageNo=${number}&pageSize=12`)
            .then(res => res.json())
            .then(action(json => {
                //this.temperatureCelsius = json.main.temp - 273.15
                //this.loading = false
                this.businessList = json.businessList;
            }))
    }

}



const businessStore = new BusinessStore()
export default businessStore;