// WR - NA => with return type and No argument

#include<stdio.h>
#include<conio.h>
int addfun();
void main(){

    int x;

    x = addfun();

    printf("The sum of the two numbers is %d\n", x);

}

int addfun(){

    int a, b, sum = 0;

    printf("Enter the first number :- ");
    scanf("%d", &a);

    printf("Enter the second number :- ");
    scanf("%d", &b);

    sum = a + b;

}