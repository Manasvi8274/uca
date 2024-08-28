// #include <errno.h>
// #include <fcntl.h>
// #include <stdlib.h>
// #include <string.h>
#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main()
{
    // write(1, "Hello World", 11);
    char c[1000];
    int x = read(0, c, 1000);
    // printf("%s\n", c);
    write(1, c, x);
    return 0;
}