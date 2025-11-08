
const sortByValue=(a,b)=>{
    return a-b;
}

const mySort =(arr,func,isAsc)=>{

    if(isAsc){
        return arr.sort(func)
    }
    else{
        return arr.sort((a,b)=>{
            return func(b,a);
        })
    }


}

var x =mySort([90,43,67,87,54,44,12,34,2,4,56],sortByValue,true)
console.log(x);
//mySort([90,43,67,87,54,44,12,34,2,4,56],xyz,true)
//mySort([90,43,67,87,54,44,12,34,2,4,56],xyz,false)