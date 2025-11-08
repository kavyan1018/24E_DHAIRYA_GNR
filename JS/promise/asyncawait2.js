const getData = ()=>{

    return new Promise((resolve,reject)=>{

        setTimeout(()=>{
            resolve("resolved...")
        },2000)
    })
}

// console.log("starts")

// getData().then((data)=>{
//     console.log(data)
// }).catch((err)=>{
//     console.log(err)
// })
// console.log("end")

//call back hell --async await...

const printData =async()=>{


    const x = await getData()
    console.log(x)

}
printData()


// async function printData() {
    
// }