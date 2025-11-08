// Structure using Loop

#include <stdio.h>
#include <conio.h>

struct student
{
    int rollno;
    char name[50];
    int std;
};
int main()
{
    struct student s[4];
    int i;

    printf("Enter the details of 5 students\n");

    for ( i = 0; i < 5; i++)
    {
        printf("Enter Your Roll No :- ");
        scanf("%d", &s[i].rollno);

        printf("Enter Your Name :- ");
        scanf("%s", s[i].name);

        printf("Enter Your Standard :- ");
        scanf("%d", &s[i].std);
    }

    printf("\n\nDetails of 5 students are :- \n");

    for (i = 0; i < 5; i++)
    {
        printf("%d\t %d\t %d\t  \n", s[i].rollno, s[i].name,  s[i].std);
        
    }
}
