
const science = (name)=>{

    //console.log(`welcome to science ${name}`);
    console.log("welcome to science "+name);
}
const commerce = (name)=>{
    console.log("welcome to commerce "+name);

}
const arts = (name)=>{
    console.log("welcome to arts "+name);
}



const admission = (cb,name)=>{

    console.log("Admission is going on");
    //cb=science("amit")
    cb(name);
    
}

//admission(science,"amit")
var per = 71;
if(per>80){
    admission(science,"amit");
}
else if(per>70){
    admission(commerce,"amit");
}
else{
    admission(arts,"amit");
}