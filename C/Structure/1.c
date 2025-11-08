// What is Structure in c ?

// Structure is user defined data type that allows you to combine data items of different kinds. Structure is used to represent a record. Suppose you want to store the information about a person: his/her name, citizenship number, address, age etc. You can easily create a structure that can hold all this information.

// Syntax of structure:

#include <stdio.h>
#include <conio.h>

struct Student
{
    int Roll_No;
    char Name;
    int Std;
};


void main()
{
    struct Student a1, a2, a3, a4, a5;

    printf("Enter Your Roll Number :-");
    scanf("%d",&a1.Roll_No);

    printf("Enter Your Name :");
    scanf("%s",a1.Name);

    printf("Enter Your Std :-");
    scanf("%d",& a1.Std);

    printf("Enter Your Roll Number :-");
    scanf("%d",&a2.Roll_No);

    printf("Enter Your Name :");
    scanf("%s",a2.Name);

    printf("Enter Your Std :-");
    scanf("%d",& a2.Std);

    printf("Enter Your Roll Number :-");
    scanf("%d",&a3.Roll_No);

    printf("Enter Your Name :");
    scanf("%s",a3.Name);

    printf("Enter Your Std :-");
    scanf("%d",& a3.Std);

    printf("Enter Your Roll Number :-");
    scanf("%d",&a4.Roll_No);

    printf("Enter Your Name :");
    scanf("%s",a4.Name);

    printf("Enter Your Std :-");
    scanf("%d",& a4.Std);

    printf("Enter Your Roll Number :-");
    scanf("%d",&a5.Roll_No);

    printf("Enter Your Name :");
    scanf("%s",a5.Name);

    printf("Enter Your Std :-");
    scanf("%d",& a5.Std);



    // 1.
    printf("%d\t %s\t %d\t",a1.Roll_No, a1.Name, a1.Std);
    printf("%d\t %s\t %d\t",a2.Roll_No, a2.Name, a2.Std);
    printf("%d\t %s\t %d\t",a3.Roll_No, a3.Name, a3.Std);
    printf("%d\t %s\t %d\t",a4.Roll_No, a4.Name, a4.Std);
    printf("%d\t %s\t %d\t",a5.Roll_No, a5.Name, a5.Std);

}