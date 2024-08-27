#include <stdio.h>
#include "26_mycalc_1.h"
#include "26_mycalc_2.h"
int main(){
	printf("add(2+3) = %d\n",add(2,3));
	printf("sub(2-5) = %d\n",sub(2,5));
	printf("multiply(2*3) = %d\n",multiply(2,3));
	printf("divide(6/2) = %d\n",divide(6,2));
	printf("max(15,45) = %d\n",max(15,45));
	printf("min(15,45) = %d\n",min(15,45));
	printf("absolute(200,15) = %d\n",absol(200,15));
	printf("mod(15,46) = %d\n" ,mod(15,46));
	return 0;
}
