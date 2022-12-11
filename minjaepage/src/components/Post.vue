<template>
  <h1>{{title}}</h1>
  <form class="post" action="#">
    <input class="post-title" name="title" type="text"> <br>
    <!-- <input class="post-content" name="content" type="text"> <br> -->
    <textarea class="post-content" name="text" id="" ></textarea>
    <div class=""  aria-label="Basic example">
      <input type="file" name="file"><br>
  <button type="button" class="btn btn-primary">등록</button>
  <button type="button" class="btn btn-primary">취소</button>
</div>
  </form>
</template>

<script>
import { ref } from "@vue/reactivity";
export default {
name:'ToPost',
setup(){
  const title = ref("Post")

  return {title}
}
}
</script>

<style>
.post{
width:1160px;
}
.post button{
  margin:10px;
}
.post-title{
  width:800px;
  height:50px;
  margin: 20px;
}
.post-content{
  margin:20px;
  width:800px;
  height: 500px;
  resize:none;
}

</style>