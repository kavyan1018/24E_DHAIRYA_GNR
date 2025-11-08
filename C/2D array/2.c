// usear input a numbers and print 2D array of size 2 x 2

#include <stdio.h>

int main() {
    int a[2][2];

    // 0, 1
    for (int i = 0; i < 2; i++) 
    {
        // 0, 1
        for (int j = 0; j < 2; j++) 
        {
            printf("Enter a number: ");
            scanf("%d", &a[i][j]);
        }
    }

    // 0, 1
    for (int i = 0; i < 2; i++) 
    {
        // 0, 1
        for (int j = 0; j < 2; j++) 
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    return 0;
}