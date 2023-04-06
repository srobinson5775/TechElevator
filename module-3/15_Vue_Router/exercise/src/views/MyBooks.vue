<template>
  <div>
    <reading-list/>
    <new-book/>
  </div>
</template>

<script>
import ReadingList from '../components/ReadingList.vue'
import NewBook from '../views/NewBook.vue'
export default {
  components: { ReadingList, NewBook },
    

}
</script>

<style>

</style>