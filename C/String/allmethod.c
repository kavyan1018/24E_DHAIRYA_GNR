// WAP using various inbuilt string functions 

#include <stdio.h>
#include <string.h>

int main()
{
    char str1[100], str2[100];
    int len1, len2;

    printf("Enter the first string: ");
    gets(str1);

    printf("Enter the second string: ");
    gets(str2);

    len1 = strlen(str1);
    len2 = strlen(str2);

    printf("The length of the first string is %d\n", len1);
    printf("The length of the second string is %d\n", len2);

    if (strcmp(str1, str2) == 0)
    {
        printf("The strings are equal\n");
    }
    else
    {
        printf("The strings are not equal\n");
    }

    strcat(str1, str2);
    printf("The concatenated string is: %s\n", str1);

    strcpy(str1, str2);
    printf("The copied string is: %s\n", str1);

    return 0;
}