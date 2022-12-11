<template>
  <Header :class="classHeader" msg="Header for Your Vue.js App" />
  <div class="nav-content-container">
    <div class="nav-container">
      <Navi :class="classNavi" msg="Header for Your Vue.js App" />
    </div>
    <!-- 컨텐트 컨테이너 -->
    <div class="content-container">
      <router-view :class="classContent"></router-view>
    </div>
  </div>
  <Footer :class="classFooter" msg="Footer for Your Vue.js App" />
</template>

<script>
import Header from "./components/include/Header.vue";
import Footer from "./components/include/Footer.vue";
import Navi from "./components/include/Navigation.vue";
export default {
  components: { Header, Footer, Navi },
  setup() {
    return {
      classContent: "content",
      classHeader: "header",
      classFooter: "footer",
      classNavi: "navi",
    };
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  margin: 0 auto;
  width: 1440px;
}
.header {
  width: 100%;
  height: 50px;
  margin: 0;
  line-height: 49px;
  padding-left: 50px;
  font-weight: bold;
  text-align: left;
  top: 0;
  background: yellow;
  float: left;
}
.nav-content-container {
  background: red;
}

.footer {
  height: 50px;
  margin: 0;
  background: rgb(220, 220, 220);
  padding-left: 50px;
  font-weight: bold;
  line-height: 50px;
  text-align: left;
  clear: both;
}
.nav-container{
  display:inline-block;
  float:left;
  
}
.navi {
  margin: 2px;
}
.content-container{
  display:inline-block;
  width:1160px;
  float:left;
  /* background: yellow; */
}
.content {
  min-height: 800px;
  width:1160px;
  padding: 10px;
  /* background: blue; */
}
</style>
