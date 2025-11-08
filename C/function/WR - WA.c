// WR - WA => with return type and with argument


#include<stdio.h>
#include<conio.h>
int addfun(int a, int b);
void main()
{
    int sum = 0, a, b;

    sum = addfun(a, b);

}

int addfun(int a, int b)
{

    int sum = 0;

    printf("Enter the first number :- ");
    scanf("%d", &a);

    printf("Enter the second number :- ");
    scanf("%d", &b);

    sum = a + b;
}