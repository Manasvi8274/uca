// #include <stdio.h>

// int main()
// {
//     FILE *pt;
//     pt = fopen("./a.txt", "r");
//     char *str[20];
//     fgets(str, 200, stdin);
//     printf("%s", str);
//     fclose(pt);
// }

// #include <stdio.h>

// int main()
// {
//     char input[100]; // Allocate space for the input

//     printf("Enter a string: ");
//     if (fgets(input, sizeof(input), stdin) != NULL)
//     {
//         printf("You entered: %s", input);
//     }
//     else
//     {
//         printf("An error occurred while reading input.\n");
//     }

//     return 0;
// }

// #include <stdio.h>

// int main()
// {
//     int num = 42;
//     double pi = 3.14159;
//     char str[] = "Hello, stdout!";

//     fprintf(stdout, "Integer: %d\n", num);
//     fprintf(stdout, "Floating-point: %f\n", pi);
//     fprintf(stdout, "String: %s\n", str);

//     return 0;
// }

// #include <stdio.h>

// int main()
// {
//     int num = 42;
//     double pi = 3.14159;
//     char str[] = "Hello, stdout!";
//     FILE *ptr;
//     ptr = fopen("./a.txt","w");
//     fprintf(ptr, "Integer: %d\n", num);
//     fprintf(ptr, "Floating-point: %f\n", pi);
//     fprintf(ptr, "String: %s\n", str);
//     fclose(ptr);
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//     FILE *pt = fopen("./a.txt", "r");
//     char st;
//     for (int i = 0; i < 100; i++)
//     {
//         // st = fgetc(pt);
//         fprintf(stdout, "%c", fgetc(pt));
//     }
//     fclose(pt);
// }

