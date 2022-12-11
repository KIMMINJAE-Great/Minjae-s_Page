<template>
  <h1>{{title}}</h1>
  <h1>Recent</h1>
  <!-- 추후 뭔가 넣을 곳 -->
  <div class="anything">추후 추가</div>
  <!-- 최신 글 -->
  <div class="latest-post" v-for="item in 6" :key="item">최신 글</div>
</template>

<script>
import { ref } from "@vue/reactivity";
export default {
  name: "ToHome",
  setup() {
    const title = ref("Home");
    return { title };
  },
};
</script>
<style>

.latest-post{
  display:inline-block;
  width:300px;
  height: 350px;
  margin:30px;
  background: green;
}
.anything{
  background: lightblue;
}
</style>