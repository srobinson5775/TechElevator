import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '../views/Home.vue'
import ReadingList from '../views/MyBooks.vue'
import NewBook from '../views/NewBook.vue'
import BookDetails from '../views/BookDetails.vue'

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path:'/myBooks',
    name:'reading-list',
    component: ReadingList
  },
  {
    path:'/addBook',
    name:'newBook',
    component: NewBook
  },
  {
    path: '/book/:isbn',
    name: 'book-details',
    component: BookDetails
  }
  
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
