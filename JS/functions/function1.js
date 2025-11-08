//function
//arrow function


function test(){
    console.log("test function");
}

function add(a,b){

    console.log(a);
    console.log(b);
    //undefined + undefined = NaN
    return a + b
}

test();

var x = add(10,20)
console.log(x);

var x1 = add()
console.log(x1);

function mul(){

    let a = 100
    return a * a
}

var ans = mul()
console.log(ans);