import {observable,computed, action} from 'mobx';
import {types,flow} from 'mobx-state-tree'
import { Button,ToggleButton,Collapse,Pagination,PageItem} from 'react-bootstrap';

class PaginationStore {
    @observable  active = 1;
    @observable  items = [];
    @observable  total = 10;


    constructor() {

    }

    @action
    handleClick(index) {
        this.active = index;
    }

}

// const paginationBasic = (
//     <div>
//         <Pagination>{items}</Pagination>
//         <br />
//
//         <Pagination size="lg">{items}</Pagination>
//         <br />
//
//         <Pagination size="sm">{items}</Pagination>
//     </div>
// );



const paginationStore = new PaginationStore()
export default paginationStore;