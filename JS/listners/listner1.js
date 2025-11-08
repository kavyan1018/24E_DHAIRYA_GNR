const btn  = document.getElementById('btn');//<button>Click me</button>
// console.log(btn)
btn.addEventListener('click',function(){
    
    btn.style.backgroundColor = 'red';
})
btn.addEventListener('dblclick',()=>{
    btn.style.backgroundColor = 'green';
})
btn.addEventListener('mouseover',()=>{
    btn.style.backgroundColor = 'blue';
    btn.style.color = 'white';
    btn.innerHTML="please click"
})
btn.addEventListener('mouseout',()=>{
    btn.style.backgroundColor = 'white';
    btn.style.color = 'black';
    btn.innerHTML="Click me"
})