const fetchData = async()=>{


    const response = await fetch("https://node5.onrender.com/user/user",{
        method:"GET"
    })

    //json is RESPONSE CLASS FUNCTION
    const data = await response.json()
    //console.log(response)
    console.log(data)
    console.log(data.message)
    console.log(data.data)
    for(let i=0;i<data.data.length;i++){
        console.log(data.data[i].name)
    }



}

//fetchData()

const fetchData2 =async()=>{

    const response = await fetch("https://reqres.in/api/users?page=2",{
        method:"GET"
    })
    const users = await response.json();
    console.log(users)
    console.log(users.data)
    for(let i=0;i<users.data.length;i++){
        console.log(users.data[i].first_name)
    }
}
fetchData2()