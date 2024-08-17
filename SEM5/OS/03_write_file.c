#include <errno.h>
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
extern int errno;

int main()
{
    int fd = open("fo.txt", O_WRONLY | O_CREAT);
    printf("%d\n", fd);
    int sz;
    sz = write(fd, "hello world \nMy name is manasvi", strlen("hello world \n My name is manasvi"));

    printf("called write(% d, \"hello world \\n My name is manasvi\", %d).It returned % d\n ", fd, strlen("hello world \n My name is manasvi"), sz);
    // printf("%d", sz);
    close(fd);
    return 0;
}

// C program to illustrate
// write system Call
// #include <stdio.h>
// #include <fcntl.h>
// #include <string.h>
// int main()
// {
//     // int sz;

//     int fd = open("foo.txt", O_WRONLY);
//     if (fd < 0)
//     {
//         perror("r1");
//         return 0;
//     }

//     int sz = write(fd, "hello world /n my name is manasvi\n", strlen("hello world /n my name is manasvi\n"));

//     printf("called write(% d, \"hello world /n my name is manasvi\\n\", %d)."
//            " It returned %d\n",
//            fd, strlen("hello world /n my name is manasvi\n"), sz);
//     close(fd);
// }