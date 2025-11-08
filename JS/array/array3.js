var lang = ["hindi","english","marathi","tamil","telugu","gujarati"];

//loop
//lang[i]
// var x = lang.some((l)=>{

//     //return predicate.. true or false
//     //return  l.startsWith("x")
//     return l.length > 10
// })

// console.log(x) //true

// var x = lang.every((l)=>{
//     return l.length > 5
// })

// console.log(x) //true


// var x = lang.some((l)=>l.includes("a"))
// console.log(x) //true


var flag = false


for(let i=0;i<lang.length;i++){

    if(lang[i].length<=5){
        flag = false
        break
    }
    else{
        flag = true
    }


}

console.log(flag) //true

