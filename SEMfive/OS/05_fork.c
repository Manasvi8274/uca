#include <errno.h>
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
extern int errno;

// int main()
// {
//      pid_t p = fork();
//      if (p < 0)
//      {
//       	perror("fail");
//         printf("WRONG");
//         exit(1);
//      }
//      printf("HELLO WORLD!,processs_id(pid) = %d\n", getpid());
//      return 0;
// }
// int main()
//{
// fork();
// printf("hello");
//  return 0;
//}

int main()
{
  if (fork() || fork())
  {
    if (fork() || fork())
    {
      fork();
    }
  }
  printf("hello\n");
  return 0;
}
