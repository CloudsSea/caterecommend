import {action, observable} from "mobx";

class SignInStore {
    @observable todos;

    constructor() {
        this.todos = [{checked: false, text: "hello"}, {checked: true, text: "world"}]
    }

    @action.bound handleClick(index) {
        let todos = this.todos
        todos[index].checked = !todos[index].checked
    }
}
const signInStore = new SignInStore()
export default signInStore;