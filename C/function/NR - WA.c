// NR - WA => No return type and with argument

#include<stdio.h>
#include<conio.h>

int addfun(int a, int b);
void main(){
    
    // I Will take Input From Usear in this main function

    int a,b;

    printf("Enter the first number :- ");
    scanf("%d", &a);

    printf("Enter the second number :- ");
    scanf("%d", &b);

}
// In this function I will do sum and  print the sum of the two numbers
int addfun(int a, int b)
{

    int sum = 0;

    sum = a + b;

    printf("The sum of the two numbers is %d\n", sum);

}