import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    todos: [
      { name: 'Wake up', done: false, category: 'Home' },
      { name: '5 Minute Morning Movement', done: false, category: 'Home' },
      { name: 'Meditate', done: false, category: 'Home' },
      { name: 'Brush teeth', done: false, category: 'Home' },
      { name: 'Shower', done: false, category: 'Home' },
      { name: 'Answer email', done: false, category: 'Work' },
      { name: 'Stand up meeting', done: false, category: 'Work' },
      { name: 'Fix a bug', done: false, category: 'Work' },
    ]
  },
  mutations: {
  },
  actions: {
  },
  modules: {
  },
  // Strict should not be used in production code. It is used here as a
  // learning aid to warn you if state is modified without using a mutation.
  strict: true
})
