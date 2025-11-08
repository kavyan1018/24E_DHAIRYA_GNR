var students =[
    {
        id:101,
        name:"ram",
        class:10
    },
    {
        id:102,
        name:"shyam",
        class:10
    },
    {
        id:103,
        name:"preeti",
        class:10
    },
    {
        id:104,
        name:"sita",
        class:10
    },
    {
        id:105,
        name:"gita",
        class:10
    },
    
]

var marks =[
    {
        name:"ram",
        marks:90
    },
    {
        name:"shyam",
        marks:80
    },
    {
        name:"preeti",
        marks:70
    },
    {
        name:"sita",
        marks:60
    },
    {
        name:"gita",
        marks:50
    }
]


const searchStudentData = (name)=>{


    console.log("********Sararching Student Data************");
    const foundStudent = students.find((student)=>student.name == name)
    if(foundStudent){
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                resolve(foundStudent)
            },2000)
        })
    }
    else{
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                reject("Student not found")
            },2000)
        })
    }



}


const fetchMarks = (studentName)=>{}



const printCertificate = (name)=>{


    console.log("********Welcome to Certificate Print************");
    var student = searchStudentData(name)
    student.then((data)=>{
        console.log("Student Data found..")
        console.log(data)

        //fetchMarks...
    })
    student.catch((data)=>{
        console.log("Student Data not found..")
    })





}


printCertificate("ram")