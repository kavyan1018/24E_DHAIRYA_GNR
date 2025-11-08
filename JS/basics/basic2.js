//var let const

var ao = 10; //global
console.log("outside block..",ao)

{
    console.log("inside block..",ao)
    
}

var ao = 20; //redeclaration
ao = 30; //reassignment
console.log("outside block..",ao)



{
    var ao = 40;//redeclaration
}
console.log("outside block..",ao)