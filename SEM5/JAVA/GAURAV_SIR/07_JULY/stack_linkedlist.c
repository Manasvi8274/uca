#include <stdio.h>
#include <stdlib.h>
#include "stack.h"
#include <limits.h>
#include <assert.h>

struct node
{
    int item;
    struct node *next;
};

int n = 0;

struct node *head = NULL;

void push(int item)
{
    struct node *oldhead = head;
    head = (struct node *)malloc(sizeof(struct node));
    head->item = item;
    n++;
    head->next = oldhead;
}

int pop()
{
    if (n == 0)
        return INT_MIN;
    // struct node *temp = head;
    int item = head->item;
    head = head->next;
    n--;
    // free(temp);
    return item;
}

bool isEmpty()
{
    return n == 0;
}

int size()
{
    return n;
}

void teststack()
{
    push(1);
    push(2);
    push(3);

    assert(pop() == 3);
    assert(size() == 2);
    assert(isEmpty() == 0);
}

int main()
{
    teststack();
}
