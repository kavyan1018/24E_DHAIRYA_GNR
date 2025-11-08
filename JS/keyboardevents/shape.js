const drawShape = ()=>{
    const shape = document.getElementById('shape');
    if(shape.value === 'circle'){
        shape.className = 'circle';
    }
    else if(shape.value === 'square'){
        shape.className = 'square';
    }
    else{
        shape.className = '';
    }
}