#include <stdio.h>

int main() {
    int i, j;
    int rows = 5; 

    for (i = 0; i < rows; i++) 
    {
        for (j = 0; j < rows; j++) 
        {
            // Conditions to print the pattern
            if (i == 0 || i == rows-1 || j == 0 || j == rows-1 || (i == rows / 2 && j == rows / 2)) {
                printf("* ");
            } else if ((i == 1 && j == 1) || (i == 1 && j == rows-2) || (i == rows-2 && j == 1) || (i == rows-2 && j == rows-2)) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }

    return 0;
}
