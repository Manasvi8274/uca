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

#include <stdio.h>

int main()
{
    char input[100]; // Allocate space for the input

    printf("Enter a string: ");
    if (fgets(input, sizeof(input), stdin) != NULL)
    {
        printf("You entered: %s", input);
    }
    else
    {
        printf("An error occurred while reading input.\n");
    }

    return 0;
}