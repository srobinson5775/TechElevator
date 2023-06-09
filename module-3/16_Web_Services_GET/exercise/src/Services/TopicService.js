import axios from 'axios';


const http = axios.create({
    baseURL: "http://localhost:3000"
});

export default{
    getTopics() {
        return http.get('/topics')
    },
    getTopicbyId(id) {
        return http.get(`/topics/${id}`)
        .then(response => response.data);
    }
}