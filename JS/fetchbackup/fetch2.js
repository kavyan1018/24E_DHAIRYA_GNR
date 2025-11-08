const getData =async()=>{



    const response = await fetch("https://node5.onrender.com/user/user",{
        method:"GET"
    })

    const users = await response.json();
    //console.log(response)
    console.log(users)



}

getData()