#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    vector<int> v = {1, 2, 3, 4, 5, 5, 5, 3, 2, 1, 3, 4, 5, 2, 2};
    map<int, int> mp;
    for (int i = 0; i < v.size(); i++)
    {
        mp[v[i]]++;
    }
    for (auto x : mp)

        cout << x.first << " " << x.second << endl;
}