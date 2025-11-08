// #include<stdio.h>
// #include<conio.h>

// int main()
// {
//     // find maximum number between 2 number

//     int a,b;

//     printf("Enter The Frist Numner :-");
//     scanf("%d",&a);

//     printf("Enter The Second Numner :-");
//     scanf("%d",&b);

//     if (a > b)
//     {
//         printf("A is Max");
//     }
//     else
//     {
//         printf("B is Max");
//     }
// }



// #include<stdio.h>
// #include<conio.h>

// int main()
// {
//     int a;

//     printf("Enter the Number between 1 to 7 :-");
//     scanf("%d",&a);

//     if (a == 1)
//     {
//         printf("The day is Monday");
//     }
//     if (a == 2)
//     {
//         printf("The day is Tuesday");
//     }
    
// }


// else if 
/*
#include<stdio.h>
#include<conio.h>

int main()
{
    int a,b;

    printf("Enter the Number 1:-");
    scanf("%d",&a);

    printf("Enter the Number 2:-");
    scanf("%d",&b);

    if (a > b)
    {
        printf("A is Max");
    }
    else if (b > a)
    {
        printf("B is Max");
    }
    else
    {
        printf("Both are same !");
    }
    
}
*/


#include<stdio.h>
#include<conio.h>

int main()
{
    int units;
    float amt,total_amt,sur_charge;

    printf("Enter the Units :-");
    scanf("%d",&units);


    if (units <= 50)
    {
        amt = units * 0.50;
    }
    else if (units <= 100)
    {
        amt = 25 + ((units - 50) * 0.75);
    }
    else if (units <= 200)
    {
        amt = 75 + ((units - 100) * 1.20);
    }
    else if (units > 250)
    {
        amt = 120 + ((units - 200) * 1.50);
    }

    sur_charge = amt * 0.20;

    total_amt = amt + sur_charge;

    printf("Electricity Bill = Rs. %.2f",total_amt);
    
}