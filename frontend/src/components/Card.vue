<template>
  <div class="card shadow-sm">
    <span class="img" :style="{backgroundImage: `url(${item.imgPath})`}"/>


    <div class="card-body">
      <p class="card-text">
        <span>{{ item.name }} &nbsp;</span>
        <small class="discount badge bg-danger">
          {{ lib.getNumberFormat(item.discountPer) }}%
        </small>
      </p>


      <div class="d-flex justify-content-between align-items-center">
        <button class="btn btn-primary">구입하기</button>


        <small class="price text-muted">

          {{ lib.getNumberFormat(item.price) }}원
        </small>

        <small class="real text-danger">
          {{ lib.getNumberFormat(item.price - (item.price * item.discountPer / 100)) }}원
        </small>
      </div>
    </div>
  </div>
</template>
<script>

import lib from "@/scripts/lib";

export default {
  name: "Card",
  // Home.vue에서 :item으로 전달받은 데이터를 prompt 형태로 String타입으로 받아서 template의 {{}}를 사용해 전달
  props: {
    item: Object
  },
  setup() {
    return {lib}
  }
}
</script>
<style scoped>

.card .img {
  display: inline-block;
  width: 100%;
  height: 250px;

  /*이미지가 태그안에 축소시켜 최대한 들어가게 만듬*/
  background-size: cover;

  /*이미지의 중심을 기준으로 위치시킴*/
  background-position: center;

}

.card .card-body .price {
  text-decoration: line-through;
}
</style>
