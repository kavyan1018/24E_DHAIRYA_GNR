// Armstrong Number

#include <stdio.h>
#include <conio.h>
#include <math.h>

void main()
{
    int no,i,sum=0,k;

    printf("Enter a number: ");
    scanf("%d",&no);

    k = no;

    while(no > 0)
    {
        i = no % 10;
        sum = sum + (i*i*i);
        no = no / 10;
    }

    if (sum == k)
    {
        printf("The Number is Armstrong Number!");
    }
    else
    {
        printf("The Nummber is Not Armstrong Number!");
    }
}