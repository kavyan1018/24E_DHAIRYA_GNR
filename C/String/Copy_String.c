#include <stdio.h>
#include <string.h>

int main() {
    char a[100], b[100];

    printf("Enter the String: ");
    scanf("%s", a);

    strcpy(b, a);

    printf("The copied string is: %s\n", b);

    return 0;
}
