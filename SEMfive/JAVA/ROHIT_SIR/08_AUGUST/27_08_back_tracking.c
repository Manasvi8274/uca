// #include <stdio.h>
// #include <stdlib.h>

// int n = 0;
// int m = 0;

// int rec(char mat[][4], int i, int j)
// {
//     printf("i=%d\tj=%d\n", n, m);
//     // base condition
//     int c = 0;
//     if ((i > n - 1 || j > m - 1) || (mat[i][j] == 'X'))
//     {
//         return 0;
//     }
//     // if cherries
//     if (mat[i][j] == '1')
//         c++;
//     // recursive function
//     int x1 = rec(mat, i, j + 1);
//     int x2 = rec(mat, i + 1, j);
//     if (x1 > x2)
//     {
//         printf("i=%d \t j=%d \t max cherry=%d\n", i, j, x1 + c);
//         return x1 + c;
//     }
//     else
//     {
//         printf("i=%d \t j=%d \t max cherry=%d\n", i, j, x2 + c);
//         return x2 + c;
//     }
// }

// int rec_1(char mat[][4], int i, int j)
// {
//     // base condition
//     int c = 0;
//     if ((i > n - 1 || j > m - 1) || (mat[i][j] == 'X'))
//     {
//         return 0;
//     }
//     // if cherries
//     if (mat[i][j] == '1')
//         c++;
//     // recursive function
//     int x1 = rec_1(mat, i, j + 1);
//     int x2 = rec_1(mat, i + 1, j);
//     if (i + 1 <= n - 1 && j + 1 <= n - 1)
//     {
//         if (mat[i + 1][j] == 'X' && mat[i][j + 1])
//         {
//             return -1;
//         }
//     }
//     if (x1 == -1 || x2 == -1)
//         return -1;
//     if (x1 > x2)
//     {
//         return x1 + c;
//     }
//     else
//     {
//         return x2 + c;
//     }
// }

// int main()
// {
//     // int n;
//     n = 4, m = 4;
//     char mat[4][4] = {{'0', '0', 'X', 'X'}, {'1', '0', '1', 'X'}, {'X', 'X', '1', '1'}, {'X', 'X', '1', '0'}};
//     int x = rec_1(mat, 0, 0);
//     printf("%d", x);
//     return 0;
// }

// #include <stdio.h>
// #include <stdlib.h>

// int n = 0;
// int m = 0;

// void rec(char mat[][3], int i, int j)
// {
//     // printf("i=%d\tj=%d\n", n, m);
//     // base condition
//     if (i == n - 1 && j == m - 1)
//     {
//         printf("%d,%d\n", i, j);
//         return;
//     }
//     if ((i > n - 1 || j > m - 1))
//     {
//         // printf("%d,%d\n", i, j);
//         return;
//     }
//     printf("%d,%d->\t", i, j);
//     // recursive function
//     rec(mat, i, j + 1);
//     rec(mat, i + 1, j);
// }

// int main()
// {
//     // int n;
//     n = 3, m = 3;
//     // char mat[4][4] = {{'0', '0', 'X', 'X'}, {'1', '0', '1', 'X'}, {'X', 'X', '1', '1'}, {'X', 'X', '1', '0'}};
//     int mat[3][3] = {{}, {}, {}};
//     rec(mat, 0, 0);
//     // printf("%d", x);
//     return 0;
// }

// #include <stdio.h>
// #include <stdlib.h>

// int n = 0;
// int m = 0;

// int rec(int mat[][4], int i, int j)
// {
//     // base condition
//     if ((i > n - 1 || j > m - 1))
//     {
//         return 0;
//     }

//     if (i == n - 1 && j == m - 1)
//     {
//         if (mat[i][j] == 1)
//             return 1;
//         return 0;
//     }

//     int x = 0;
//     if (mat[i][j] == 1)
//     {
//         x++;
//     }
//     // recursive function
//     int x1 = rec(mat, i, j + 1);
//     int x2 = rec(mat, i + 1, j);
//     if (x1 + x > x2 + x)
//         return x1 + x;
//     else
//         return x2 + x;
// }

// int main()
// {
//     n = 3, m = 4;
//     int mat[3][4] = {{1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
//     int z = rec(mat, 0, 0);
//     printf("%d", z);
//     return 0;
// }

// #include <stdio.h>
// #include <stdlib.h>

// int n = 0, m = 0;

// int min(int a,int b){
//     if(a<b) return a;
//     else return ;
// }

// int rec(int mat[][m], int i, int j, int n, int m)
// {
//     // base condition
//     if ((i > n - 1 || j > m - 1))
//     {
//         // printf("\n");
//         return 0;
//     }

//     if (i == n - 1 && j == m - 1)
//     {
//         if (mat[i][j] == 1)
//             return 1;
//         return 0;
//     }
//     // printf("%d,%d\t",i,j);

//     int x = 0;
//     if (mat[i][j] == 1)
//     {
//         x++;
//     }
//     // recursive function
//     int x1 = rec(mat, i, j + 1, n, m);
//     int x2 = rec(mat, i + 1, j, n, m);
//     return x+ min(x1,x2);
// }

// int main()
// {
//     n = 4, m = 4;
//     int mat[4][4] = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {0, 1, 0, 1}};
//     int z = rec(mat, 0, 0, n, m);
//     printf("%d\n", z);
//     return 0;
// }

#include <stdio.h>
#include <stdlib.h>
