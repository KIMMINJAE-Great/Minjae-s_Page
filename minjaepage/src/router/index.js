import { createRouter, createWebHistory } from "vue-router"
import Home from "@/components/Home.vue"
import Diary from "@/components/Diary.vue"
import GuestBook from "@/components/GuestBook.vue"
import Introduce from "@/components/Introduce.vue"




const routes = [
  //alias 기존 주소에 별칭 부여, redirect 다른 페이지로 이동
  {path: "/", name:"Home",component: Home, alias: '/main',},
  {path: "/diary", name:"Diary",component: Diary},
  {path: "/guestbook", name:"GuestBook",component: GuestBook},
  {path: "/introduce", name:"Introduce",component: Introduce},
  
  
]

const router = createRouter({
  //createWebHistory url에 변화없이 사용
  //createHashJistory #을 넣는 주소가 됨
  history:createWebHistory(), routes,
})

export default router