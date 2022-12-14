import {createApp} from 'vue'
import App from './App.vue'
import {createRouter, createWebHistory} from 'vue-router'
import Home from "@/pages/Home";
import Login from "@/pages/Login";

const routes = [
    // 루트경로로 들어올때는 컴포넌트를 Home으로 연결
    {path: '/', component: Home},
    {path:'/login', component: Login}
]

const router = createRouter({
    history: createWebHistory(),
    routes: routes
})
createApp(App).use(router).mount('#app')
