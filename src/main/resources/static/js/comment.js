async function getList(bno) {

    const result = await axios.get(`/comments/${bno}`)
    console.log(result.data)
    return result.data;
}

// async function getList({bno, page, size, goLast}){
//
//     const result = await axios.get(`/comments/${bno}`, {params: {page, size}})
//
//     if(goLast){
//         const total = result.data.total
//         const lastPage = parseInt(Math.ceil(total/size))
//         return getList({bno:bno, page:lastPage, size:size})
//     }
//
//     return result.data
// }

async function addComment(commentObj, boardId) {
    const response = await axios.post(`/comments/${boardId}`,commentObj)
    return response.data
}

async function addReComment(commentObj, parentId) {
    const response = await axios.post(`/comments/${parentId}`,commentObj)
    return response.data
}

async function getComment(id) {
    const response = await axios.get(`/comments/${id}`)
    return response.data
}

async function modifyComment(commentObj) {

    const response = await axios.put(`/comments/${commentObj.id}`, replyObj)
    return response.data
}

async function removeComment(id) {
    const response = await axios.delete(`/comments/${id}`)
    return response.data
}