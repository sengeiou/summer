import axios from 'axios'

const tokenService = {
    getToken(auth) {
        return axios.get('/auth/token', { auth });
    }
}

export default tokenService
