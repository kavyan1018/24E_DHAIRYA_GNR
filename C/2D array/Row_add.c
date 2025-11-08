// Row wise  sum of two dimensional arrays
#include <stdio.h>
#include<conio.h>

void main(){

    int a[3][4],i,j,sum=0,gt=0;

    printf("Enter the 12 elements of the array\n");

    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }

    printf("Your Matrix is here :\n");

    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
        {
            printf("%d",a[i][j]);
            sum = sum + a[i][j];  // total 12 elements of the array  12 ==>  3 * 4  +    ==> ?
        }
        printf(" = %d\n",sum);
        gt = gt + sum;
        printf("\n");
    }

    printf("Grand Total = %d",gt);
}