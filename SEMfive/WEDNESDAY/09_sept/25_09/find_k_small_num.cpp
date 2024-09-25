#include <iostream>
#include <bits/stdc++.h>

using namespace std;

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

    sort(v.begin(), v.end());

    for (int i = 0; i < k; i++)
    {
        cout << v[i] << "\t";
    }
    cout << endl;
}