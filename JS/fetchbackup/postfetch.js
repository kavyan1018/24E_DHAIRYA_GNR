const sendData = async()=>{

    const data ={
        name:"parth",
        age:18,
        email:"parth@gmail.com",
        isActive:true
    }

    const response = await fetch("https://node5.onrender.com/user/user",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(data)
    })

    const savedUser = await response.json()
    console.log(savedUser)
}
