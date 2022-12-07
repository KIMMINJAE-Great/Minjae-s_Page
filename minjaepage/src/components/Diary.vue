<template>
  <h1>{{title}}</h1>
</template>

<script>
import {ref} from '@vue/reactivity'
export default {
name:'ToDiary',
setup(){
  const title = ref('Diary')
  return {title}
}
}
</script>

<style>

</style>