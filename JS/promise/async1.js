const generateData = () => {


    return new Promise((resolve, reject) => {

        setTimeout(()=>{
            resolve("promise has been resolved...")
        },3000)
    })
}



const printData = async()=>{

        // generateData().then((data)=>{
        //     console.log("data is",data)
        // })

        console.log("before data")
        var data = await generateData()
        console.log("data is",data)
        console.log("after data")


}




printData()