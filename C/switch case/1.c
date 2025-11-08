#include<stdio.h>
#include<conio.h>

void main()
{
    int a;

    printf("Enter The Number between 1 to 7 :-");
    scanf("%d",&a);

    switch (a)
    {
    case 1:
        printf("The day is Sunday");
        break;
    case 2:
        printf("The day is Monday");
        break;

    default:
        printf("Enter the Valid Choice !");
        break;
    }
}