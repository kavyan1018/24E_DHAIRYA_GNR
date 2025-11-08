
var images = ["js.png","mongo.png","java.png"];

const loadImage = ()=>{

        var randomIndex = Math.floor(Math.random() * images.length);
        console.log(randomIndex);
        const myimage = document.getElementById("myimage");
        myimage.src = images[randomIndex];

}