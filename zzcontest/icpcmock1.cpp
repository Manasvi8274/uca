#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        long int k,n;
        cin>>n>>k;
        vector<int> v(n);
        map<int,int> mp;
        for(int i=0;i<n;i++){
            int x;
            cin>>x;
            v[i]=x;
            mp[x]+=1;
        }
        if(n-mp.size() <=k){
            cout<<(n*(n-1))/2<<endl;
            continue;
        }
        priority_queue<int>hp;
        for(auto x:mp){
            hp.push(x.second);
        }
        long long int ans = 0;
        for(int i=0;i<n-1;i++){
            mp[v[i]]-=1;
            ans += n-1-i-mp[v[i]];
        }
        while(k>0){
            int z = hp.top();
            ans+=z-1;
            hp.pop();
            hp.push(z-1);
            k-=1;
        }
        cout<<ans<<endl;
    }
}