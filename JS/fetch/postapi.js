const addUser = async () => {
  //POST API LOGIC...
  //req object
  //req.body
  //req.params
  //req.query
  //req.headers
  const userObj = {
    name: "ajay",
    email: "ajay@gmail.com",
    age: 26,
    isActive: true,
  };

  const res = await fetch("https://node5.onrender.com/user/user", {
    method: "POST",
    headers: {
      "Content-Type": "application/json", // Set header for JSON data
    },
    body: JSON.stringify(userObj), // Convert object to JSON string
  });
  const data = await res.json();
  console.log(data);
};
