const zomato = () => {
  console.log("********Welcome to Zomato************");

  var promise = new Promise((resolve, reject) => {
        setTimeout(()=>{
            resolve("Pizza")
            // //reject("Pizza not found")
            // resolve({
            //     dish: "Pizza",
            //     restaurant: "xyz",
            //     order: "undefined",
            //     payment: "done",
            //     delivery: "done",
            //     deliveryStatus: "delivered"
            // })
        },3000)
  });
  
  promise.then((data) => {
    console.log("Dish found is " , data);
  });
  promise.catch((data) => {
    console.log("Dish not found");
  });



};
zomato();
