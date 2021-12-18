import axios from 'axios'

let base = "http://localhost:5000"
export const getRequest = function(url, params) {
    return axios({
        method: 'GET',
        baseURL: base,
        url: url,
        params: params,
        headers: {
            "Content-Type": "application/json"
        },
        responseType: "json",
        responseEncoding: "utf-8"
    })
}


export const postRequest = function(url, data) {
    return axios({
        method: 'post',
        baseURL: base,
        url: url,
        data: data,
        headers: {
            "Content-Type": "application/json"
        },
        responseType: "json",
        responseEncoding: "utf-8"
    })
}
