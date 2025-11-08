var data  = ["java","python","js","react","spirng","node"]


var x = data.push("cpp")
console.log("new len..",x)

console.log(data)
var x = data.pop()
console.log("removed element..",x)
console.log(data)

data.unshift("c++")
console.log(data)

var x = data.shift()
console.log("removing...",x)

console.log(data)


// for(let i=0;i<data.length;i++){
//     console.log(data[i])
// }