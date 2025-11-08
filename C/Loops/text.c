#include <stdio.h>

int main() {
    int digits[10]; 
    int number;
    int count = 0;

    printf("Enter a number: ");
    scanf("%d", &number);

    if (number == 0) {
        printf("zero ");
        return 0;
    }

    if (number < 0) {
        printf("negative ");
        number = -number;
    }

    while (number > 0) {
        digits[count] = number % 10;
        number /= 10;
        count++;
    }

    
    for (int i = count - 1; i >= 0; i--) 
    {
        switch(digits[i]) 
        {
            case 0: 
                    printf("zero "); 
                    break;
            case 1: 
                    printf("one "); 
                    break;
            case 2: 
                    printf("two "); 
                    break;
            case 3: 
                    printf("three "); 
                    break;
            case 4: 
                    printf("four "); 
                    break;
            case 5: 
                    printf("five "); 
                    break;
            case 6: 
                    printf("six "); 
                    break;
            case 7: 
                    printf("seven "); 
                    break;
            case 8: 
                    printf("eight "); 
                    break;
            case 9: 
                    printf("nine "); 
                    break;
        }
    }

    return 0;
}
