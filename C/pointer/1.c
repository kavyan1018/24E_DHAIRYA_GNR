// What is pointer in c language?
// Pointer is a variable that stores the address of another variable.

#include <stdio.h>
#include <conio.h>

void main()
{
    int i;
    i = 10;
    int *ptr;
    ptr = &i; 

    printf("i = %d\n", i);
    printf("i = %u\n", *ptr);

    printf("Address of i = %u\n", &i);
    printf("Address of i = %u\n", ptr);

}