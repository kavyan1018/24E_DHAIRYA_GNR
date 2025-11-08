var country = "india"

// var ind = country.indexOf("o") // 0
// ind = country.lastIndexOf("i") // 3
// console.log(ind);

var ind = -1;
for(let i=0;i<country.length;i++){

    if(country[i]=="i"){
        ind = i;
        break;
    }

}
console.log(ind);


//india
//inda
//remove duplicate char 

const str = "indiaax";
let result = '';

for (let i = 0; i < str.length; i++) {
  const char = str[i];
  if (result.indexOf(char) === -1) {
    result += char;
  }
}

console.log(result); // Output: "ind"
