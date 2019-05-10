import {action, observable} from "mobx";

class SearchStore {
    @observable keywords = "Search";

    constructor() {

    }

    @action.bound handleClick(text) {
        this.keywords = text;
    }
}
const searchStore = new SearchStore()
export default searchStore;