#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// int main(){
//     int arr[11] = {}
// }

int invert(int x, int p, int n)
{
    // int y=x;
    // y>>p;
    return ((~(~0 << n)) << p) ^ x;
}

// x=10101010111110000101
// p=3
// n=4

int bitand(int x, int y)
{
    // no use of & ,no loop , no if
    return (~(~x | ~y));
}

int condi(int x, int y, int z)
{
    // return ((!x) & 1) | z + (!((!x) & 0)) | y;
    return ((!!x << 31 >> 31) & y) + ((!x << 31 >> 31) & z);
}

int bang(int x)
{
    // return ((x | (~x + 1)) >> 31) + 1;
    // return (((x >> 31) & 1) | ((~x + 1) >> 31) & 1) ^ 1;
}

int main()
{
    // printf("%d", bang(1));
    printf("%d", condi(0, 4, 3));
    // printf("%d", 1 << 15);
}