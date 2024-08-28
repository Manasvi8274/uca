#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int top=-1;
int stack[4];
int stackpop[4];
int popi=0;

int push (int n){
    if(top==3){
        printf("\t\t\t\t---------STACK OVERFLOW------- at %d\n",n);
        return 0;
    }
    else{
        top++;
        stack[top]=n;
    }
}

int pop(){
    if(top==-1){
        printf("\t\t\t\t--------STACK UNDERFLOW--------");
        return 0;
    }
    else{
        stackpop[popi]=stack[top];
        popi++;
        top=top-1;
    }
}

void printstack(){
    printf("\n");
    for(int i=0;i<=top;i++){
        printf("%d\t",stack[i]);
    }
    printf("\n");
}

void printstackpop(){
    printf("\n");
    for(int i=0;i<popi;i++){
        printf("%d\t",stackpop[i]);
    }
    printf("\n");
}

int main(){

    while(1){
        int n;
        printf("ENTER THE OPERATION\n1 for push\n2 for pop \n3 for display stack\n4 to display poplist\n5 to see top element of list\n6 to check if the list is empty or not\n7 to check the size:\n");
        scanf("%d",&n);
        if(n==1){
            int x;
            printf("enter the element to be pushed:");
            scanf("%d",&x);
            push(x);
        }
        else if(n==2){
            pop();
        }
        else if(n==3){
            printstack();
        }
        else if(n==4){
            printstackpop();
        }
        else if(n==5){
            printf("top element of the list is %d\n",stack[top]);
        }
        else if(n==6){
            if(top==1){
                printf("stack is empty\n");
            }
            else{
                printf("stack is not empty\n");
            }
        }
        else if(n==7){
            printf("the current size of stack = %d\n",top+1);
        }
        else{
            return 0;
        }
    }
}
