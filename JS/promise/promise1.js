console.log('Promise starts');
var promise = new Promise((resolve,reject)=>{

    //resolve('Promise is resolved');
    //reject('Promise is rejected');
    setTimeout(()=>{
        //resolve('Promise is resolved');
        reject('Promise is rejected');
    },2000)
    

})
console.log(promise);
//data == resolve data
promise.then((data)=>{

    console.log(data);
})
//data == reject data
promise.catch((data)=>{

    console.log(data);
})

