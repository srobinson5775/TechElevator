<template>
  <div>
      <form class="new-book-form">
        <div>
          <input class="title-input" type="text" placeholder="Book Title"/>
          <input class="author-input" type="text" placeholder="Author" />  
          <input class="isbn-input" type="number" placeholder="ISBN"/>
        </div>
      </form>
  </div>
</template>

<script>
export default {
    data() {
        return{
            newBook: {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }
        }
    },
    methods: {
        addBook() {
            this.$store.commit('ADD_BOOK', this.newBook)
        }
    }
}
</script>

<style>

</style>