// types of function in c programming
// 1. User-defined function


// wr-wa => with return type and with argument
// wr-na => with return type and No argument
// nr-wa => No return type and with argument
// nr-na  => No return type and No argument



// NR - NA => No return type and No argument

// Two nubers addition

#include<stdio.h>
#include<conio.h>
int addfun();
int subfun();
void main(){

    int choice;

    printf("Enter 1 for addition\n");
    printf("Enter 2 for subtraction\n");
    printf("Enter 3 for multiplication\n");
    printf("Enter 4 for division\n");

    switch (choice)
    {
    case 1: addfun();
        break;
    
    case 2: subfun();
        break;

    default:
        break;
    }

}

int addfun(){

    int a, b, sum = 0;

    printf("Enter the first number :- ");
    scanf("%d", &a);

    printf("Enter the second number :- ");
    scanf("%d", &b);

    sum = a + b;

    printf("The sum of the two numbers is %d\n", sum);

}

int subfun(){

    int a, b, sum = 0;

    printf("Enter the first number :- ");
    scanf("%d", &a);

    printf("Enter the second number :- ");
    scanf("%d", &b);

    sum = a - b;

    printf("The sum of the two numbers is %d\n", sum);
}