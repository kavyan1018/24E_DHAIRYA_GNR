var company =[
    {
        name:"google",
        employees:[
            {
                id:1001,
                name:"sundar pichai",
                post:"ceo",
                salary:100000,
                age:45,
                hobbies:["cricket","reading1"]
            },
            {
                id:1002,
                name:"larry page",
                post:"founder",
                salary:200000,
                age:50,
                hobbies:["reading","travelling"]
            }
        ]
    },
    {
        name:"facebook",
        employees:[
            {
                id:1003,
                name:"mark zuckerberg",
                post:"ceo",
                salary:150000,
                age:35,
                hobbies:["reading","travelling"]
            },
            {
                id:1004,
                name:"chris hughes",
                post:"founder",
                salary:250000,
                age:40,
                hobbies:["reading","travelling"]
            }
        ]
    }
]

// var googleemps = company.find((comp)=>comp.name =="google")
// console.log(googleemps.employees)

var facebookemps = company.find((comp)=>comp.name =="facebook").
employees.map((emp)=>emp.name)
console.log(facebookemps)


// var cricketemps = company.find((comp)=>comp.name =="google").
// employees.filter((emp)=>emp.hobbies.includes("cricket"))
// console.log(cricketemps)

var readingHoobyemp = company.map((cmp)=>cmp.employees.filter((emp)=>emp.hobbies.includes("reading")))
console.log(readingHoobyemp)

var readingHoobbyemp = company.
flatMap((cmp)=>cmp.employees.filter((emp)=>emp.hobbies.includes("reading")))
console.log(readingHoobbyemp)