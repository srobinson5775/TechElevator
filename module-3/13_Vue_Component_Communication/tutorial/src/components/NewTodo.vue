<template>
  <section class="new-todo">
      <form>
          <input type="text" placeholder="Name">
          <select>
              <option value="">---Select a category ---</option>
              <option value="Home">Home</option>
              <option value="Work">Work</option>
          </select>
          <button>Add</button>
      </form>
  </section>
</template>

<script>
export default {

}
</script>

<style>
.new-todo {
    width:450px;
    background:#fff;
    margin: auto;
    font-family: 'Roboto Condensed', sans-serif;
    border-radius:10px;
}
input, select, button {
    padding: 5px 5px;
    margin:5px;
}

</style>