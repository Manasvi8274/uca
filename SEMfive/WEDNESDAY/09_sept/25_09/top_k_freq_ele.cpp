#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> fun(vector<int> nums, int k)
{
    map<int, int> mp;
    for (auto x : nums)
    {
        mp[x]++;
    }
    vector<int> v;
    for (auto x : mp)
    {
        v.push_back(x.second);
    }
    sort(v.begin(), v.end());
    vector<int> ans;
    for (int i = v.size() - 1; i >= 0; i--)
    {
        if (k > 0)
        {
            for (auto &x : mp)
            {
                if (x.second == v[i])
                {
                    ans.push_back(x.first);
                    x.second = -1;
                    k--;
                }
            }
        }
        else
        {
            break;
        }
    }
    return ans;
}

int main()
{
    int n;
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n; i++)
    {
        int t;
        cin >> t;
        v.push_back(t);
    }
    int k;
    cin >> k;
    vector<int> ans = fun(v, k);

    for (auto x : ans)
    {
        cout << x << "\t";
    }
}