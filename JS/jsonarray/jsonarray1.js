var students = [
    {
        id:101,
        name:"raj",
        age:23
    },
    {
        id:102,
        name:"ajay",
        age:24
    },
    {
        id:103,
        name:"jay",
        age:25
    }
]

var names = students.map((stu)=>{
    return stu.name.toUpperCase()
})
console.log(names) // [ 'raj', 'ajay', 'jay' ]

var newArray = students.map((stu)=>{
    return{
        sid:stu.id + 1000,
        sname:stu.name.toUpperCase(),
        sage:stu.age + stu.age
    }
    
})
console.log(newArray)


var filArray = students.filter((stu)=>{
    return stu.age > 23
})
console.log(filArray)

var totalAGe = students.reduce((sum,stu)=>{
    return sum + stu.age
},0)
console.log(totalAGe)




