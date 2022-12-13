<template>
  <div class="home">

    <section class="py-5 text-center container">
      <div class="row py-lg-5">
        <div class="col-lg-6 col-md-8 mx-auto">
          <h1 class="fw-light">Album example</h1>
          <p class="lead text-muted">Something short and leading about the collection below—its contents, the creator,
            etc. Make it short and sweet, but not too short so folks don’t simply skip over it entirely.</p>
          <p>
            <a href="#" class="btn btn-primary my-2">Main call to action</a>
            <a href="#" class="btn btn-secondary my-2">Secondary action</a>
          </p>
        </div>
      </div>
    </section>

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
