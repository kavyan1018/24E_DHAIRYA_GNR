var email = "  raj@gmail.com   "
console.log(email.length)

email  = email.trim()
//email = email.trimEnd()
//email = email.trimStart()
console.log(email.length)
console.log(email)



//boolean

//var x = email.includes("@")
var x = email.includes("@",3)
console.log(x)

//var x = email.startsWith("raj")
var x = email.startsWith("r",2)
console.log(x)
var x = email.endsWith("com")
console.log(x)




function customTrim(str) {
    let start = 0;
    let end = str.length - 1;
  
    // Function to check if a character is a whitespace
    function isWhitespace(char) {
      return char === ' ' || char === '\n' || char === '\t' ||
             char === '\r' || char === '\f' || char === '\v';
    }
  
    // Find the first non-whitespace character from the start
    while (start <= end && isWhitespace(str[start])) {
      start++;
    }
  
    // Find the first non-whitespace character from the end
    while (end >= start && isWhitespace(str[end])) {
      end--;
    }
  
    // Build the new trimmed string
    let result = '';
    for (let i = start; i <= end; i++) {
      result += str[i];
    }
  
    return result;
  }
  
  // Example usage
  const originalString = "   He llo, World!   ";
  const trimmedString = customTrim(originalString);
  console.log(trimmedString); // Outputs: "Hello, World!"
  
