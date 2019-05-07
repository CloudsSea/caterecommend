// import axios from "axios";
//
// export function getSearchData(keyword, moduleType, start = 0, count = 6) {
// // 底层请求使用 axios： 基于promise 的HTTP 库，可以用在浏览器和node.js中。
//     return axios.get(`/${moduleType}/search`, {
//         params: {
//             q: keyword,
//             start,
//             count
//         }
//     });
// }
import {action} from "mobx";

function doLogin(number){
    //window.fetch(`http://api.openweathermap.org/data/2.5/weather?appid=${APPID}&q=${this.location}`)
    window.fetch(`restaurant/getlist?optType=1&pageNo=${number}&pageSize=12`)
        .then(res => res.json())
        .then(action(json => {
            //this.temperatureCelsius = json.main.temp - 273.15
            //this.loading = false
            return json;
        }))
}