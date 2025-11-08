var numbers = [1, 2, 3, 4, 5, 6];

const getData = () => {
  console.log("called...");

  var randomIndex = Math.floor(Math.random() * numbers.length);
  var x = numbers[randomIndex];
  console.log(x);

  var p = document.getElementById("txt");

  if (x == 1) {
    p.innerHTML = `   *   `;
  } else if (x == 2) {
    p.innerHTML = `*   *`;
  } else if (x == 3) {
    p.innerHTML = `*   *<br>  *  `;
  } else if (x == 4) {
    p.innerHTML = `*     *\n*     *`;
  } else if (x == 5) {
    p.innerHTML = `*   *\n  *  \n*   *`;
  } else if (x == 6) {
    p.innerHTML = `*   *\n*   *\n*   *`;
  } else {
    p.innerHTML = `. . . . . . .`;
  }
};

const startControl = () => {
 

  
    
    var randomIndex = Math.floor(Math.random() * numbers.length);
    var x = numbers[randomIndex];
    console.log(x);

    var p = document.getElementById("txt");

    if (x == 1) {
      p.innerHTML = `   *   `;
      p.style.backgroundColor = "red";
    } else if (x == 2) {
      p.innerHTML = `*   *`;
      p.style.backgroundColor = "green";
    } else if (x == 3) {
      p.innerHTML = `*   *<br>  *  `;
      p.style.backgroundColor = "blue";
    } else if (x == 4) {
      p.innerHTML = `*     *\n*     *`;
      p.style.backgroundColor = "brown";
    } else if (x == 5) {
      p.innerHTML = `*   *\n  *  \n*   *`;
      p.style.backgroundColor = "orange";
    } else if (x == 6) {
      p.innerHTML = `*   *\n*   *\n*   *`;
      p.style.backgroundColor = "purple";
    } else {
      p.innerHTML = `. . . . . . .`;
    }
  

 
  
};
