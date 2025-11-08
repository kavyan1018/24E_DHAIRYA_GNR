//string char array
//string immutable
//string array : size : 

var data = "javascript";
//console.log(data[0]);

// for(let i=0;i<data.length;i++){
//     console.log(data[i]);
// }

var x = data.charAt(1);
console.log(x);

var y = data.charCodeAt(1); //a --> 97
console.log(y);

//var z = String.fromCharCode(65)
var z = String.fromCharCode(y); //97 --> a
console.log(z);

var z1 = String.fromCharCode(data.charCodeAt(1)-32);
console.log(z1);



//var x = "amit" 
//AMIT

var user = "Amit";
var upperUser = "";
for(let i=0;i<user.length;i++){

    //A ==> 65
    //m ==> 109
        if(user.charCodeAt(i)>=97 && user.charCodeAt(i)<=122){
            upperUser = upperUser + String.fromCharCode(user.charCodeAt(i)-32);
            //"A" = A+"M"
        }
        else{
            //"" = ""+A
            upperUser = upperUser + user[i];
        }

}
console.log(upperUser);

var p1 = "amit";
p1 = p1.toUpperCase();
console.log(p1);

var q1 = "AMIt";
q1 = q1.toLowerCase();
console.log(q1);








