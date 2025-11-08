const button = document.getElementById("btn")
button.addEventListener("click",()=>{

    const output = document.getElementById("output") //<div>
    //crete h1 tag..
    const h1 = document.createElement("h1")//<h1></h1>
    h1.innerHTML = "Hello World"

    output.appendChild(h1)


})


button.addEventListener("click",()=>{

    var users = ["amit","sumit","kunal","sachin","rahul"]
    const output = document.getElementById("output") //<div>
    const ul = document.createElement("ul")//<ul></ul>
    for(let i=0;i<users.length;i++){

        const li = document.createElement("li")//<li></li> , <li></li>
        li.innerHTML = users[i]//<li>amit</li>,<li>sumit</li>
        ul.appendChild(li)//<ul><li>amit</li></ul>,<ul><li>amit</li><li>sumit</li></ul>

    }
    output.appendChild(ul)//<div><ul><li>amit</li><li>sumit</li></ul></div>


})

button.addEventListener("dblclick",()=>{

    const output = document.getElementById("output") //<div>
    
    const image = document.createElement("img")//<img>
    image.src="https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png"
    output.appendChild(image)


})