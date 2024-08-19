#include <stdio.h>
#include <stdlib.h>

// struct card{
//     char c[10];
//     char n[10];

// };

// int main(){
//     struct card c1,c2;
//     printf("ENTER CARD 1 SUITE : - ");
//     scanf("%d",&c1.c);
//     printf("ENTER CARD 1 NUMBER : - ");
//     scanf("%d",&c1.n);
//     printf("ENTER CARD 2 SUITE : - ");
//     scanf("%d", &c2.c);
//     printf("ENTER CARD 2 NUMBER : - ");
//     scanf("%d", &c2.n);
//     if(c1.c == c2.c)    printf("SUITE OF CARDS ARE SAME\n");
//     else    printf("SUITE OF CARDS ARE NOT SAME\n");
// }

#define SUIT_MASK 0x30
int samesuite(char card1,char card2){
    // return !((card1 & SUIT_MASK) ^ (card2 & SUIT_MASK));
    return !((card1 & 48) ^ (card2 & 48));
}

int number(char card1,char card2){
    
}

int main(){
    char c1[6],c2[6];
    scanf("%s",&c1);
    scanf("%d",&c2);
    int ss=samesuite(c1,c2);
    int nn=number(c1,c2);
    if(ss==0)   printf("NOT SAME SUITE\n");
    else    printf("SAME SUITE\n");

}

/////////////////////matrix problem
// int main(){
//     long int rows;
// }