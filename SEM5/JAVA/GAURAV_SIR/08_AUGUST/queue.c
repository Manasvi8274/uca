#include <stdio.h>
#include <assert.h>
#include <errno.h>
#include <stdlib.h>
struct node
{
    int val;
    struct node *next;
};

struct node *head = NULL;
struct node *curr = NULL;
int n = 0;

void push(int value)
{
    // struct node *new = head;
    // head = (struct node *)malloc(sizeof(struct node));
    // head->val = value;
    // head->next = head;
    // new->next = head;
    if (n == 0)
    {
        // printf("in push %d\n", value);
        struct node *new1 = (struct node *)malloc(sizeof(struct node));
        new1->val = value;
        new1->next = NULL;
        head = new1;
        curr = head;
        n++;
        // printf("in push %d\n", value);
        return;
    }
    else
    {
        // printf("in push %d\n", value);
        struct node *new1 = (struct node *)malloc(sizeof(struct node));
        new1->val = value;
        new1->next = NULL;
        curr->next = new1;
        curr = new1;
        n++;
        return;
    }
}

int pop()
{
    if (head == NULL)
    {
        perror("------------------UNDERFLOW----------------------");
        return -1;
    }
    else
    {
        int vl = head->val;
        head = head->next;
        n--;
        return vl;
    }
}

int isEmpty()
{
    return n == 0;
}

int size()
{
    return n;
}

// void print()
// {
//     while (head)
//     {
//         printf("%d", head->val);
//         head = head->next;
//     }
// }

void test_sample()
{
    // printf("%d", 1234);
    push(1);
    push(2);
    push(3);
    printf("size = %d\n", size());
    printf("pop 1 = %d\n", pop());
    printf("pop 2 = %d\n", pop());
    printf("pop 2 = %d\n", pop());
    printf("isEmpty() = %d\n", isEmpty());
    printf("size = %d\n", size());
    // print();
    // assert(pop() == 1);
    // assert(pop() == 2);
    // assert(size() == 0);
}

int main()
{
    test_sample();
    return 0;
}