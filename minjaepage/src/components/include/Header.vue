<template>
  <div class="header-up-container">
    <p class="header-up">로그인 이미지</p>
  </div>
  <div class="header-signboard-container">
    <h1>어서오세요</h1>
  </div>
</template>

<script>
export default {
  name: "VueHeader",
};
</script>

<style>
.header-up-container {
  background: yellow;
  height: 40px;
  line-height: 40px;
}
.header-up {
  text-align: right;
  margin-right: 50px;
}
.header-signboard-container {
  background: gray;
  height: 180px;
}
.header-signboard-container h1 {
  line-height: 180px;
}
</style>