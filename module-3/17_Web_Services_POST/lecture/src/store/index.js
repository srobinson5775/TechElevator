import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    boards: [],
    activeBoardId: null,
    boardCards: [],
    card: {
      title: '',
      description: '',
      status: '',
      comments: []
    }
  },
  mutations: {
    SET_BOARDS(state, boards) {
      state.boards = boards;
    },
    SET_ACTIVE_BOARD(state, boardId) {
      state.activeBoardId = boardId;
    },
    SET_BOARD_CARDS(state, cards) {
      state.boardCards = cards;
    },
    SET_CURRENT_CARD(state, card) {
      state.card = card;
    },
    DELETE_BOARD(state, boardIdToDelete) {
      state.boards = state.boards.filter((board) => {
        return board.id !== boardIdToDelete;
      });
    }
  },
  actions: {
  },
  modules: {
  }
})
