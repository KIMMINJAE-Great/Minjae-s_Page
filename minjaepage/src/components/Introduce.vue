<template>
  <h1>{{title}}</h1>
</template>

<script>
  import { ref } from '@vue/reactivity'
export default {
name:'ToIntroduce',
setup(){
  const title = ref('Introduce')

  return{title}
}
}
</script>

<style>

</style>