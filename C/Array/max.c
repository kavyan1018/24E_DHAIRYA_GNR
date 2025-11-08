#include<stdio.h>
#include<conio.h>

void main()
{
    int a[5],i,max;

    printf("Enter the 5 values :-");
    for (i = 0; i <= 4; i++)
    {
        scanf("%d",&a[i]);
    }

    max = a[0];
    for (i = 0; i <= 4; i++)
    {
        if (max < a[i])
        {
                max = a[i];
        }
    }
    printf("Max is %d",max);
}