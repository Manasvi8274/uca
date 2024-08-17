#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main()
{
    FILE *fptr;
    fptr = fopen("new.txt", "r+");

    if (fptr)
        printf("FILE IS PRESENT\n");
    else
        printf("FILE IS NOT PRESENT\n");

    FILE *fptr2;
    fptr2 = fopen("new1.txt", "r");
    if (fptr2)
        printf("FILE IS PRESENT\n");
    else
        printf("FILE IS NOT PRESENT\n");
    return 0;
}

// #include <errno.h>
// #include <fcntl.h>
// #include <stdio.h>
// #include <unistd.h>

// extern int errno;

// int main(){
//     int fd = open("foo.txt" , O_RDONLY | O_CREAT);
//     printf("%d\n",fd);
//     if (close(fd) < 0)
//     {
//         perror("c1");
//         return 0;
//     }
//     return 0;
// }