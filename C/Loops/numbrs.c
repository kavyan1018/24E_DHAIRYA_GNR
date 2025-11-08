#include <stdio.h>

int main() {
    int num, digit, temp;
    printf("Enter a number: ");
    scanf("%d", &num);

    temp = num;
    int digit_count = 0;
    while (temp != 0) {
        digit_count++;
        temp /= 10;
    }

    int digits[digit_count];

    temp = num;
    for (int i = digit_count - 1; i >= 0; i--) {
        digits[i] = temp % 10;
        temp /= 10;
    }

    for (int i = 0; i < digit_count; i++) {
        switch (digits[i]) {
            case 0: printf("zero "); break;
            case 1: printf("one "); break;
            case 2: printf("two "); break;
            case 3: printf("three "); break;
            case 4: printf("four "); break;
            case 5: printf("five "); break;
            case 6: printf("six "); break;
            case 7: printf("seven "); break;
            case 8: printf("eight "); break;
            case 9: printf("nine "); break;
        }
    }

    return 0;
}
