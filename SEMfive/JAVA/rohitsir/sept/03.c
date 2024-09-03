#include <stdio.h>
#include <stdlib.h>

void *custom(int n)
{
    char *ar = (char *)malloc(sizeof(char) * n);
    for (int i = 0; i < n; i++)
    {
        ar[i] = 0;
    }
    return ar;
}

int main()
{
    int *c = (int *)custom(20);
    for (int i = 0; i < 6; i++)
    {
        printf("%d\t", c[i]);
    }
}