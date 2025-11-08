// searching elements of an array

#include <stdio.h>

void main()
{
    int a[50], i, j, temp=0, n, m;

    printf("Enter the number of elements: ");   
    scanf("%d", &n);

    printf("Enter the %d values : ", n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Enter the element to be searched: ");
    scanf("%d", &m);    
    
    for (i = 0; i < n; i++)
    {
        if (a[i] == m)
        {
            printf("Element found at position %d\n", i+1);
            temp = 1;
            break;
        }
        else
        {
            temp = 0;
        }
    }

    if (temp == 0)
    {
        printf("Element not found\n");
    }
}