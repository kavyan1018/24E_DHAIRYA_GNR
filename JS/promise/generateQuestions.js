
const generateExam = ()=>{


    return new Promise((resolve,reject)=>{

        setTimeout(()=>{
            resolve({
                id:"java101",
                name:"java",
                subject:"java",
                marks:100,
                time:60,
                questionCount:50
            })
        },2000)


    })

}

const generateQuestion = (exam)=>{

    console.log("generating questions for exam",exam.name)

    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve({
                exam:exam,
                questions:[
                    {q:"what is java?"},{q:"what is java?"},{q:"what is java?"}
                ]
            })
        },3000)
    })


}

const giveExam = ()=>{

    console.log(".....welcome to exam portal...")
    console.log("****generating exam*****")
    generateExam().then((exam)=>{
        console.log("exam generated")
        console.log("exam details",exam)
        generateQuestion(exam).then((quesions)=>{
            console.log("questions generated")
            console.log("questions",quesions)
            //result.theb()
        })

    }).catch((err)=>{
        console.log("error in generating exam")
    })


}
giveExam()