// #include<stdio.h>
// #include<conio.h>

// void main()
// {
//     int i;

//     i=1;
//     while(i<=5)
//     {
//         printf("\nHello World !");
//         i++;
//     }
// }

#include<stdio.h>
#include<conio.h>

void main()
{
    int i;

    i=1;
    while(i<=10)
    {
        if (i % 2 == 0)
        {
            printf("%d,",i);
        }
        i++;
    }
}