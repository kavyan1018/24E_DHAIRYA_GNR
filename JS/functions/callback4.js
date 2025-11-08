const pdfHandler = (fileName) =>{

    return fileName + ' is a pdf file';
}
const jpgHandler = (fileName) =>{

    return fileName + ' is a jpg file';
}
const txtHandler = (fileName) =>{

    return fileName + ' is a text file'; 
}


const uploadFile =(fileName,callback)=>{


    //console.log(`${fileName} is uploaded`);
    //console.log(fileName +" is uploaded");
    //pdfHandler(fileName);
    // var x = callback(fileName);
    // //console.log(x);
    // return x;

    return callback(fileName);

}

var file = 'sample.pdf';
var x;
if(file.endsWith('.pdf')){
    x = uploadFile(file,pdfHandler);
}
console.log(x);