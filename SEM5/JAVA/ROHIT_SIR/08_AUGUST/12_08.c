#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void sort(int a[],int size , int (*compare)(int,int)){
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(compare(a[i],a[j])){
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}

}

int compareasc(int a,int b){
	return a>b;
}

int comparedesc(int a,int b){
	return a<b;
}

void print(int arr[],int size){
	for(int i=0;i<size;i++)
	{
		printf("%d\t",arr[i]);
	}
	printf("\n");
}

int main(){
	int arr[8]={5,6,4,7,8,2,9,10};
	sort(arr,8,compareasc);
	print(arr,8);
	sort(arr,8,comparedesc);
	print(arr,8);
	return 0;
}






//int add(int a,int b){
//    return a+b;
//}
//int sub(int a, int b)
//{
//    return a - b;
//}
//float divide(int a, int b)
//{
//    return a / b;
//}
//int mul(int a, int b)
//{
//    return a * b;
//}

//void perform(void(*operation)(int,int),int a,int b){//here int(*operation)(int,int) = function pointer;
//	printf("%d\n",operation(a,b));
//}

//int main(){
//    perform(add,6,3);
//    perform(sub,6,3);
//   perform(divide,6,3);
//    perform(mul,6,3);
//    return 0;
//}



// int main()
// {
//     int *a1 = (int *)malloc(sizeof(int));
//     int *a1[0] = (int *)malloc(sizeof(int));
//     int *a1[0] = 1;
//     int *a1[1] = (int *)malloc(sizeof(int));
//     int *a1[1] = 2;
//     int *a1[2] = (int *)malloc(sizeof(int));
//     int *a1[2] = 3;

//     int *a2 = (int *)malloc(sizeof(int));
//     int *a2[0] = (int *)malloc(sizeof(int));
//     int *a2[0] = 4;
//     int *a2[1] = (int *)malloc(sizeof(int));
//     int *a2[1] = 5;
//     int *a2[2] = (int *)malloc(sizeof(int));
//     int *a2[2] = 6;

//     int *a3 = (int *)malloc(sizeof(int));
//     int *a3[0] = (int *)malloc(sizeof(int));
//     int *a3[0] = 7;
//     int *a3[1] = (int *)malloc(sizeof(int));
//     int *a3[1] = 8;
//     int *a3[2] = (int *)malloc(sizeof(int));
//     int *a3[2] = 9;

//     int **arr = (int **)malloc(sizeof(int*));
//     int **arr[0] = (int **)malloc(sizeof(int*));
//     int **arr[0] = a1;
//     int **arr[1] = (int **)malloc(sizeof(int*));
//     int **arr[1] = a2;
//     int **arr[2] = (int **)malloc(sizeof(int*));
//     int **arr[2] = a3;
//     return 0;
// }
