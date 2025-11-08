#include<stdio.h> 
#include<conio.h> 
void main() 
{ 
int a[3][4]; 
int i,j,sum=0,gt=0; 

    printf("Enter 12 values :"); 
    for(i=0;i<=2;i++) 
    { 
       for(j=0;j<=3;j++) 
       { 
          scanf("%d",&a[i][j]); 
       } 
    } 
    printf("\nYour matrix is here : \n"); 
    for(i=0;i<=2;i++) 
    { 
      for(j=0;j<=3;j++) 
                 { 
       printf("%d\t",a[i][j]); 
       sum=sum+a[i][j]; 
     } 
      printf(" = %d\n\n",sum); 
      gt=gt+sum; 
      printf("\n"); 
     } 
    printf("--------------------------------------------------------\n"); 
    for(i=0;i<=3;i++) 
    { 
      for(j=0;j<=2;j++) 
                 { 
       sum=sum+a[j][i]; 
     } 
      printf("  %d\t",sum); 
     } 
    
     printf("\t\t\t\t = %d",gt); 
    
} 