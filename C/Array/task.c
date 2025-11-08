#include<stdio.h>
#include<conio.h>

void main()
{
    int a[2],temp;

    printf("Enter the Number a:-");
    scanf("%d",&a[0]);

    printf("Enter the Number b:-");
    scanf("%d",&a[1]);

    temp = a[0];
    a[0] = a[1];
    a[1] = temp;

    printf("\n After swap the Value of A :- %d",a[0]);
    printf("\n After swap the Value of B:- %d",a[1]);

}