<template>
  <div class="home">



    <div class="album py-5 bg-light">
      <div class="container">

        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          <!--items List의 내용을 item에 담아 :item 프롬프트 형태로 전달-->
          <div class="col" v-for="(item, idx) in state.items" :key="idx">
            <Card :item="item"/>
          </div>

        </div>
      </div>
    </div>
  </div>
</template>
<script>
import axios from "axios";
import {reactive} from "vue";
import Card from "@/components/Card";

export default {
  name: "Home",
  components: {Card},
  setup() {
    const state = reactive({
      items: []
    })
    // axios.get("/api/items").then((res) => {
    //   //state의 items는 res.의 데이터이다 (alpha, beta, gamma)
    //   state.items = res.data;
    axios.get("/api/items").then(({data}) => {

      state.items = data;
      console.log(data);
    })
    return {state}
  }

}

</script>

<style scoped>
</style>
