const submitHandler = (event) => {
  event.preventDefault();

  const name = document.getElementById('name').value;
  const email = document.getElementById('email').value;
  
  let isError = false; // Keep isError local to this function

  if (isEmpty(name)) {
    console.log('Name is empty');
    isError = true;
  }
  if (isEmpty(email)) {
    console.log('Email is empty');
    isError = true;
  }

  if (!isError) {
    printData();
  } else {
    console.log("Form contains errors");
  }
};

const printData = () => {
  alert('Data Submitted');
};

const isEmpty = (value) => {
  return value.trim() === '';
};

const nameHandler = () => {
  const name = document.getElementById('name').value;

  if (checkLength(3, 10, name)) {
    console.log('Name is valid');
  } else {
    console.log('Name is invalid');
  }
};

const emailHandler = () => {
  const email = document.getElementById('email').value;

  if (checkLength(8, 100, email)) {
    console.log('Email is valid');
  } else {
    console.log('Email is invalid');
  }
};

const checkLength = (minLen, maxLen, param) => {
  return param.trim().length >= minLen && param.trim().length <= maxLen;
};
