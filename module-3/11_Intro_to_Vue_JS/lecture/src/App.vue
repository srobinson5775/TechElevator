<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png" />
    <product-review></product-review>
    <HelloWorld msg="Welcome to Your Vue.js App" />
  </div>
</template>

<script>

import ProductReview from './components/ProductReview.vue';

export default {
  name: "app",
  components: {
    ProductReview
  }
}
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
