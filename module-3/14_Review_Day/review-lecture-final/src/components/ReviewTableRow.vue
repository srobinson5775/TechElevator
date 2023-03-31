<template>
  <tr>
      <td> {{ review.title }} </td>
      <td> {{ review.reviewer }} </td>
      <td> {{ review.review }} </td>
      <td class="stars"> 
          <img 
            src="../assets/star.png"
            v-bind:title="review.rating + ' Star Review'"
            class="ratingStar"
            v-for="n in review.rating"
            v-bind:key="n"            

          />
      </td>
      <td>
         <input type="checkbox" 
         v-bind:checked="review.favorited"
         v-on:change="onFavoritedChange(review)" />
      </td>

  </tr>
</template>

<script>
export default {
    name: "review-table-row",
    props: ["review"],
    methods: {
        onFavoritedChange(review){
            this.$store.commit("FLIP_FAVORITED", review);
        }
    }


}
</script>
   

<style>
    .ratingStar{
        width:20px;
    }
</style>