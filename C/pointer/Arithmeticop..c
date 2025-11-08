#include <stdio.h>

int main()
{
    int x, y, z, a;
    int *p, *q, *r;
    
    x = 10;
    y = 8;
    z = 5;

    p = &x;
    q = &y;
    r = &z;

    a = *p + *q + *r;

    printf("Sum of three numbers is %d", a);

}
