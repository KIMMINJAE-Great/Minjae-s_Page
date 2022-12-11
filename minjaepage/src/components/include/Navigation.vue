<template>
<div class="card" style="width: 17.5rem;">
  <img class="card-img-top" src="@/assets/altimage.jpg">
  <div class="card-body">
    <p class="card-text">이름: 김민재<br>나이 29</p>
  </div>
</div>
  <div class="d-flex flex-column flex-shrink-0 p-3 bg-light" style="width: 280px; height:600px;" >   
      <span class="fs-4">목록</span>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto">
      <li class="nav-item">
        <router-link to="/" class="nav-link link-dark">Home
            <span class="visually-hidden">(current)</span>
          </router-link>
          <!-- class 명에 active 추가시 파란 바탕 생성 -->
        <!-- <router-link to="/" class="nav-link active">Home
            <span class="visually-hidden">(current)</span>
          </router-link> -->
        <!-- <a href="#" class="nav-link active" aria-current="page">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#home"></use></svg>
          Home
        </a> -->
      </li>
      <li>
        <router-link to="/introduce" class="nav-link link-dark">제작자 소개
            <span class="visually-hidden">(current)</span>
          </router-link>
      </li>
      <li>
       <router-link to="/diary" class="nav-link link-dark">다이어리
            <span class="visually-hidden">(current)</span>
          </router-link>
      </li>
      <li>
      <router-link to="/guestbook" class="nav-link link-dark">방명록
            <span class="visually-hidden">(current)</span>
          </router-link>
      </li>
      <li>
      <router-link to="/post" class="nav-link link-dark">글쓰기
            <span class="visually-hidden">(current)</span>
          </router-link>
      </li>
    </ul>
    <hr>
    <div class="dropdown">
      <a href="#" class="d-flex align-items-center link-dark text-decoration-none dropdown-toggle" id="dropdownUser2" data-bs-toggle="dropdown" aria-expanded="false">
        <img src="https://github.com/mdo.png" alt="" width="32" height="32" class="rounded-circle me-2">
        <strong>mdo</strong>
      </a>
      <ul class="dropdown-menu text-small shadow" aria-labelledby="dropdownUser2">
        <li><a class="dropdown-item" href="#">New project...</a></li>
        <li><a class="dropdown-item" href="#">Settings</a></li>
        <li><a class="dropdown-item" href="#">Profile</a></li>
        <li><hr class="dropdown-divider"></li>
        <li><a class="dropdown-item" href="#">Sign out</a></li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "SideNavigation",
};
</script>

<style>
.profile {
  height: 50px;
  width: 80px;
}
</style>