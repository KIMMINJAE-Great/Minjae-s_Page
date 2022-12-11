<template>
  <h1>{{ title }}</h1>
  <div class="diary-container">
    <!-- 글 -->
    <div class="diary">a</div>
    <!-- 리스트 및 페이징 -->
    <div class="layout">

    </div>
  </div>
</template>

<script>
import { ref } from "@vue/reactivity";
export default {
  name: "ToDiary",
  setup() {
    const title = ref("Diary");
    return { title };
  },
};
</script>

<style>
.diary-container {
  width: 1160px;
}
.diary {
  width: 1160px;
  background: peru;
}
</style>