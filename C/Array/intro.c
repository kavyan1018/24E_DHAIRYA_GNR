/*#include<stdio.h>
#include<conio.h>

void main()
{
    int a[5] = {2,10,29,11,30};

    printf("Values of array are :");

    printf("%d %d %d %d %d", a[0],a[1],a[2],a[3],a[4]);
}

*/

// usear input 

#include<stdio.h>
#include<conio.h>

void main()
{
    int a[5];


    printf("Enter the 5 value :- ");
    scanf("%d %d %d %d %d", &a[0],&a[1],&a[2],&a[3],&a[4]);
    
    printf("Values of array are :");
    printf("%d %d %d %d %d", a[0],a[1],a[2],a[3],a[4]);
}