/*#include<stdio.h>
#include<conio.h>

void main()
{
    int i,j;

    for (i = 1; i <= 5; i++)
    {
        for (j = 1; j <= 5; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    
}*/
/*
#include<stdio.h>
#include<conio.h>

void main()
{
    int i,j;

    for (i = 1; i <= 5; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    
}
*/



#include <stdio.h>

void main()
{
    int i, j;

    for (i = 1; i <= 5; i++)
    {
        // print space
        for (j = i; j < 5; j++)  
        {
            printf(" ");
        }
        
        // print star
        for (j = 1; j <= i; j++) 
        {
            printf("*");
        }
        printf("\n");
    }
}
