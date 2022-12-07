<template>
  <h1>{{title}}</h1>
</template>

<script>
import { ref } from '@vue/reactivity'
export default {
name: 'ToGuestBook',
setup(){
  const title = ref('GeustBook')

  return{title}
}
}
</script>

<style>

</style>