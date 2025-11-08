#include<stdio.h>
#include<conio.h>

void main()
{
    int hotelmenu,Gujarti;

    printf("1..Gujarati !");
    printf("\n2..Punjabi !");
    printf("\n3..South Indian !");

    printf("\nEnter the Your Fav Dish :-");
    scanf("%d",&hotelmenu);

    switch (hotelmenu)
    {
    case 1:
            printf("\nYou Have Selected Gujarati !");

            printf("\n1..Roti");
            printf("\n2..Subji");
            printf("\n3..Dal");
            printf("\n4..Rice");
            printf("\n5..Sweet");
            scanf("%d",&Gujarti);

            switch (Gujarti)
            {
            case 1:
                /* code */
                break;
            
            default:
                break;
            }
        break;
    
    default:
        break;
    }
}