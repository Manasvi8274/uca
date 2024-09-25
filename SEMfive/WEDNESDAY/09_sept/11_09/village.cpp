#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,m;
    cin>>n;
    priority_queue<int> maxheap;
    for (int i = 0; i < n; i++)
    {
        int t;
        cin>>t;
        maxheap.push(t);
    }
    cin>>m;
    m=m-n;
    while(m>0){
        maxheap.top()
        m--;
    }
}