const display = document.getElementById('display');
const buttons = document.getElementsByClassName('btn');
let currentInput = '';
let operator = '';
let firstOperand = null;

// Loop through the buttons and add event listeners
for (let button of buttons) {
    button.addEventListener('click', () => {
        const value = button.getAttribute('data-value');

        if (value === 'C') {
            // Clear the display
            currentInput = '';
            operator = '';
            firstOperand = null;
            display.value = '';
        } else if (value === '=') {
            // Calculate the result
            if (firstOperand !== null && operator) {
                currentInput = calculate(firstOperand, parseFloat(currentInput), operator);
                display.value = currentInput;
                firstOperand = null; // Reset first operand
                operator = ''; // Reset operator
            }
        } else if (['+', '-', '*', '/'].includes(value)) {
            // Set the operator and save the first operand
            if (currentInput !== '') {
                firstOperand = parseFloat(currentInput);
                operator = value;
                currentInput = '';
            }
        } else {
            // Append the clicked number to the current input
            currentInput += value;
            display.value = currentInput;
        }
    });
}

function calculate(a, b, op) {
    switch (op) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            return a / b;
        default:
            return b;
    }
}
