const submitHandler = (event) => {

    event.preventDefault(); //prevent the default form submit action
    //console.log("Form Submitted");

    const name = document.getElementById("name").value;
    console.log("name = ",name);
    const email = document.getElementById("email").value;
    console.log("email = ",email);

    const gender = document.getElementById("male").checked ? "male" :
    document.getElementById("female").checked ? "female" : "other";
    console.log("gender...",gender)

    const country = document.getElementById("country").value;
    console.log("country = ",country);



}
