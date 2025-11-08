var data = [100,20,56,78,34,67]

// var elm;
// for(let i=0;i<data.length;i++){

//         if(data[i]>=50){
//             elm = data[i];
//             break;
//         }

// }

// console.log(elm); //56


var elm = data.find((el)=>{
    return el>=50;
})
console.log(elm); 


//findIndex
var x = data.findIndex((el)=>{
    return el<=50;
})
console.log(x); 

//map - []    : it will all elements of array and return new array
//filter - []  : it will return all elements of array which satisfy the condition
//find -  : it will return first element which satisfy the condition
//findIndex -  : it will return index of first element which satisfy the condition
//reduce -  : it will return single value from array
//forEach -  : it will iterate over array
//some -  : it will return true if any element satisfy the condition
//every -  : it will return true if all elements satisfy the condition
//sort -  : it will sort the array
//reverse -  : it will reverse the array
