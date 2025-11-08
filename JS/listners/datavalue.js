const buttons = document.getElementsByClassName('btn');
console.log(buttons);
for(let i=0;i<buttons.length;i++){

    buttons[i].addEventListener('click', function(){
        const value = buttons[i].getAttribute('data-value');
        console.log(value);
    })
    

}