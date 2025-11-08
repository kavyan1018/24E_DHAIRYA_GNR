const printData = (event) => {
  //console.log('Event data: ', event);
  //console.log('onClick event called...');

  //console.log(document.getElementById("txt").innerText)
  var x = document.getElementById("txt"); //<p>hugashbsaas<p>
  //console.log(x.innerHTML);
  x.innerHTML = "This was p tag";
  x.style.color = "red";
  x.style.backgroundColor = "yellow";

  x.style.width = "100px";
};

const changeLink = () => {
  var link = document.getElementById("link");
  //console.log(link);
  setTimeout(() => {
    //console.log("3 seconds passed")
    link.href = "https://www.netflix.com";
    link.innerHTML = "Netflix";
    link.target = "_blank";
  }, 3000);
};
