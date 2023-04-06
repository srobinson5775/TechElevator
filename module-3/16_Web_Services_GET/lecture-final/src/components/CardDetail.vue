<template>
  <div>
    <h1>{{ card.title }}</h1>
    <p>{{ card.description }}</p>
    
    <div class="loading" v-if="isLoading">
        <img src="../assets/ping_pong_loader.gif" />
    </div>

    <!-- <comments-list v-bind:comments="card.comments" v-if="!isLoading"/>  or can use an else-->
    <comments-list v-bind:comments="card.comments" v-else />
    
    <div v-if="!isLoading">
        <router-link v-bind:to="{name: 'Board', params: {id: $route.params.boardID } }">Back to Board</router-link>
    </div>
  </div>
</template>

<script>
import boardsService from '../services/BoardService';
import commentsList from '../components/CommentsList.vue'

export default {
  name: "card-detail",
  components: {
    commentsList
  },
  data(){
    return{
      card:{
        title: '',
        description: '',
        status: '',
        comments: []
      },
      isLoading: true
    };
  },
  created(){
    boardsService
      .getCard(this.$route.params.boardID, this.$route.params.cardID)
      .then (response =>{
        this.card = response;   
        this.isLoading = false;    

      });

  }

};
</script>
