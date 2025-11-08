// What is String in C  
// String is a sequence of characters. In C language, strings are represented as arrays of characters. The array of characters is called a string.

// but i want to declar hole String.....


#include <stdio.h>

int main()
{
    char name[20];    
    printf("Enter your name: ");
    scanf("%s", name);
    
    printf("Your name is %s", name);
}