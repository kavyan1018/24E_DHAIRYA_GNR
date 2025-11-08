
function toBeCalled(){
    console.log("I am called");
}

function add(a){

    //console.log(a);
    //toBeCalled();
    a();
}


add(toBeCalled)
// add(10)
// add(true)
// add({})
// add([])
// add("hello")
// add(undefined)
// add(null)