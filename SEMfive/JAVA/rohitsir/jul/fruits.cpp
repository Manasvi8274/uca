#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int ans=0;
    vector<int> v;
    for (int i = 0; i < n; i++)
    {
        int t;
        cin >> t;
        v.push_back(t);
    }
    if (n < 2)
    {
        cout << "NOT possible" << endl;
        return 0;
    }
    else
    {
        map<int, int> mp;
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < n)
        {
            mp[v[p2]]++;
            while (mp.size() > 2)
            {
                mp[v[p1]]--;
                if(mp[v[p1]]==0)   mp.erase(v[p1]);
                p1++;
            }
            ans = max(ans, p2 - p1 + 1);
            p2++;
        }
        cout << "ANSWER = " << ans;
    }
    return 0;
}