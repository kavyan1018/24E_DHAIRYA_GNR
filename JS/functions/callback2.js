
const train=()=>{
    console.log("Train is running");
}

const bus=()=>{
    console.log("Bus is running");
}


const plane=()=>{
    console.log("Plane is running");
}



//callback
const driver = (cb)=>{
    //cb = train

    console.log("Driver is driving the vehicle");
    cb();
}


var drive = "train";
if(drive == "bus"){
    driver(bus);
}
else if(drive == "train"){
    driver(train);
}
else if(drive == "plane"){
    driver(plane);
}



