var marks = [90,43,67,87,54,44,12,34,2,4,56]

const sortByValue=(a,b)=>{
    //90 <43
    //90 67
    //90 87
    // [43 90]
    // [43 67 90]
    // [43 67 87 90]
    // [43 ,54, 67, 87, 90]
    //90-43
    return a-b;
}

//marks = marks.sort()
marks = marks.sort(sortByValue)
console.log(marks);


var lang = ["hindi","english","java","c","python","js","ruby"];
lang = lang.sort((a,b)=>{
    return b.length - a.length;
})
console.log(lang);



// lang = lang.reverse();
// console.log(lang);
