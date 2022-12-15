import {createStore} from 'vuex'

// Create a new store instance.
const store = createStore({
    //state는 프로젝트에서 공통으로 사용할 변수를 정의
    state() {
        return {
            account: {
                id: 0
            }
        }
    },
    //mutations는 state를 변경시키는 역할
    //commit('함수명', '전달인자')으로 실행 시킬 수 있다.
    mutations: {
        setAccount(state, payload) {
            state.account.id = payload;
        }
    }
})

export default store;