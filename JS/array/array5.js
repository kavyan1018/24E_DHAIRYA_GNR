var marks = [34,78,78,56,98]

// var total =0
// for(let i=0;i<marks.length;i++){


//         total = total + marks[i];
// }
// console.log(total);

var ans = marks.reduce((total,m)=>{
    //total =0 m=34
    //34
    //total =34 m=78
    return total+m;
},0)
console.log(ans);