<template>
  <div>
      
      <h1>{{ book.title }}</h1>
      <h2>{{ book.author }}</h2>
      <img v-bind:src="'http://covers.openlibrary.org/b/isbn' + book.isbnd + '-M.jpg'" />
      <h2>{{ book.read ? 'I have read this book' : 'I have not read this book'}}</h2>
  </div>
</template>

<script>
export default {
    created() {
        this.isbn = this.$route.params.isbn;
    },
    computed: {
        book() {
            return this.$store.state.books.find(book => book.isbn === this.isbn) ||
            this.$store.state.popularBooks.find(book => book.isbn === this.isbn)
        }
    }
}
</script>

<style>

</style>