#include <stdio.h>

// int main()
// {
//     int n;
//     scanf("%d", &n);
//     int arr[n];
//     for (int i = 0; i < n; i++)
//     {
//         scanf("%d", &arr[i]);
//     }

//     int s = 0, e = n - 1, mid = (s + e) / 2;
//     int ans = 0;
//     while (s <= e)
//     {
//         if (arr[mid] > arr[mid + 1])
//         {
//             ans = mid;
//             e = mid - 1;
//             // printf("%d", mid);
//         }
//         else if (arr[mid] < arr[mid + 1])
//         {
//             ans = mid + 1;
//             s = mid + 1;
//         }
//         mid = (s + e) / 2;
//     }
//     printf("%d", ans);
//     return 0;
// }

// int main()
//{
//     int n;
//     scanf("%d", &n);
//     int neg = 0;
//    if(n<0){
//        neg=1;
//         n=-n;
//     }
//     int rev = 0;
//     int flag = 1;
//     while (n && flag)
//     {
//         int d = n % 10;
//         n = n / 10;
//         if (rev > (__INT_MAX__ - d) / 10)
//         {
//            flag = 0;
//         }
//         rev = rev * 10 + d;
//     }
//     if (flag)
//     {
//         if(neg){
//             printf("%d",-rev);
//         }
//         else{
//             printf("%d",rev);
//         }
//     }
//     else
//     {
//         printf("%d", 0);
//     }
//
//     return 0;
// }

int main()
{
	int a = 500;
	int *b = &a;
	char *c = &a;
	printf("%d\n", *b);
	printf("%d\n", *c);
	return 0;
}
