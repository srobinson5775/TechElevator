<template>
  <div class="book-container">
    <book-card v-for="book in books" v-bind:key="book.isbn" v-bind:book="book" />
  </div>
</template>

<script>
import BookCard from './BookCard.vue'

export default {
  name: 'reading-list',
  components: {BookCard},
  computed:{
    books() {
      return this.$store.state.books;
    }
  }
  
}
</script>

<style>
.book-container {
    display: flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>