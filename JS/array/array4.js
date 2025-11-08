//var lang = ["java","c","python","js","ruby"];
//forEach
//lang[i]

// for(let i=0;i<lang.length;i++){
//     console.log(lang[i]);
// }

// lang.forEach((l)=>{

//     console.log(l);
// })


// lang = lang.map((l)=>{
//     return l.toUpperCase();
// })

console.log(lang);


// // var l1 = lang.filter((l)=>{

// //     //java.length > 2 true if it true then it will return java
// //     return l.length > 2;
// // })
// console.log(l1);
var lang = ["java","c","python","js","ruby"];

var l1 = []

for(let i=0;i<lang.length;i++){

    if(lang[i].length>2){
        l1.push(lang[i]);
    }
}

console.log(l1);

///["naman","ajay","madam"]
//function --> plaindrome custome function


const reverseString = (str)=>{
    //java

    var rev = "";
    for(let i=str.length-1;i>=0;i--){
            rev = rev + str[i];
    }
    console.log(rev);
    //ajav
    //c
    if(str === rev){
        //console.log("Plaindrome");
        return true;
    }
    else{
        //console.log("Not Plaindrome");
        return false;
    }

}

//reverseString("abc");

var x =  lang.filter((l)=>{
    //java //c
    return reverseString(l); //false//true
})
console.log(x);