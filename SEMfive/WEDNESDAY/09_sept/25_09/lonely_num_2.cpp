#include <iostream>
#include <bits/stdc++.h>
#include <math.h>
using namespace std;

// int main()
// {
//     int n;
//     cin >> n;
//     map<int, int> mp;
//     for (int i = 0; i < n; i++)
//     {
//         int t;
//         cin >> t;
//         mp[t]++;
//     }

//     for (auto x : mp)
//     {
//         if (x.second == 1)
//         {
//             cout << x.first << "\t";
//         }
//     }
//     cout << endl;
// }

int main()
{
    int n;
    cin >> n;
    vector<int> v;
    for (int i = 0; i < n; i++)
    {
        int t;
        cin >> t;
        v.push_back(t);
        // cout << v[t] << "\t";
    }

    int xo = 0;
    for (int i = 0; i < n; i++)
    {
        xo = xo ^ v[i];
    }

    int ii = 1;
    while (xo & 1 != 1)
    {
        xo >> 1;
        ii << 1;
    }
    cout << ii;

    int x1 = 0, y1 = 0;

    for (int i = 0; i < n; i++)
    {
        if (v[i] & ii == 1)
        {
            cout << " 1 = " << v[i] << endl;
            x1 = x1 ^ v[i];
        }
        else
        {
            cout << " 0 = " << v[i] << endl;
            y1 = y1 ^ v[i];
        }
    }
    cout << x1 << "\t" << y1;
}