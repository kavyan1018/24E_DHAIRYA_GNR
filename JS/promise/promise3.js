var getData = ()=>{


    return new Promise((resolve,reject)=>{
      //  resolve("promise has been resolved...")
      setTimeout(()=>{
        resolve("promise has been resolved...")
      },1500)
    })

    
}


var x = getData()
console.log(x) // data
x.then((data)=>{
    console.log(data)
})
x.catch((data)=>{
    console.log(data)
})

