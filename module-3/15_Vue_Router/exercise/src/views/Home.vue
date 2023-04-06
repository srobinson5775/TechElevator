<template>
  <div class="home">
      <best-seller-list/>
          
        <new-releases-list/>
            
  </div>
</template>

<script>
import BestSellerList from '../components/BestSellerList.vue'
import NewReleasesList from '../components/NewReleasesList.vue'
export default {
  components: { NewReleasesList, 
                BestSellerList },
  
}
</script>

<style>

</style>
BestSellerList