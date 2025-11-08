const getData = (event) => {

    const name = document.getElementById("name").value;
    console.log(name);
    var x = name.split('')
    console.log(x)
    var ind = 0;
    switch (true) {
        case x.includes('+'):
            ind = x.indexOf('+');
            var a = parseInt(x.slice(0, ind).join(''));
            var b = parseInt(x.slice(ind + 1).join(''));
            console.log(a + b);
            break;
        case x.includes('-'):
            ind = x.indexOf('-');
            var a = parseInt(x.slice(0, ind).join(''));
            var b = parseInt(x.slice(ind + 1).join(''));
            console.log(a - b);
            break;
        case x.includes('*'):
            ind = x.indexOf('*');
            var a = parseInt(x.slice(0, ind).join(''));
            var b = parseInt(x.slice(ind + 1).join(''));
            console.log(a * b);
            break;
        case x.includes('/'):
            ind = x.indexOf('/');
            var a = parseInt(x.slice(0, ind).join(''));
            var b = parseInt(x.slice(ind + 1).join(''));
            console.log(a / b);
            break;
        default:
            console.log('No operator found');
    }
    



}