const fetchBoxes = ()=>{

    const boxes = document.getElementsByClassName('box');
//    console.log(boxes);
    for(let i=0;i<boxes.length;i++){
        if(i%2==1){
            console.log(i);
            boxes[i].className = "box1"
        }
    }


}