// console.log("starts")
// setTimeout(()=>{
//     console.log("2 seconds")
// },2000)
// console.log("ends")

//zomato
//dish search : 100000
//restaurant selection :- xyz
//order add to cart : undefined
//payment
//delivery
//delivery status 


const zomato1 = ()=>{

    console.log("********Welcome to Zomato************")
    var dish = searchDish()
    
    console.log("Dish found is "+dish)
}

const searchDish = ()=>{

    var dish ;
    console.log(`Searching for pizza..`)
    //console.log("Searching for "+dish)
    setTimeout(()=>{
        dish = "Pizza"
        console.log("Dish found")
        return dish
    },5000)

    
    
}

zomato()