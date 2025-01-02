#include<bits/stdc++.h>
using namespace std;

#define int long long 

void solve(){
    int n, s, d;
    cin >> n >> d >> s;
    if((s * 2 > n) || (s > d)){
        cout<<s<<"\n";
        return;
    }
    if (d * 2 <= n)
    {
        int ans = d % s;
        int first = d -= ans;
        cout << 2 * first << "\n";
        return;
    }
    int start = d % s;
    start = d - start;
    int ans = 0;
    for(int i = start; i <= n; i++){
        if(i % s == 0){
            if((i - s) <= d){
                ans = max(ans,i);
            }
            else if(i % 2 == 0 and (i / 2) % s == 0){
                    ans = max(ans,i);
            }
        }
    }


    // int ans = 0;
    // if(d + s >=  (n/s)*s){
    //     ans = (n/s)*s;
    // }
    // else{
    //     int x = (((2 * d) - n) + 1)/2;
    //     d -= x;
    //     ans  = ((d / s) *s) * 2;

    // }
    cout<<ans<<"\n";
   
}


// void solveB(){
//     string s;
//     cin>>s;
//     int vowel = 0;
//     int n = s.length();
//     map<char,int>mp;
//     mp['a'] = 1;mp['e'] = 1; mp['i'] = 1; mp['o'] = 1; mp['u'] = 1;
//     int n = 0; int g = 0;
//     int y = 0;
//     for(int i = 0; i < s.length(); i++){
//         if(mp.find(s[i]) != mp.end()){
//             vowel++;
//         }
//         else if(s[i] == 'n'){
//             n++;
//         }
//         else if(s[i] == 'g'){
//             g++;
//         }
//         else if(s[i] == 'y'){
//             y++;
//         }
//     }
//     int cost = n - vowel;
//     int normal = cost - y - n - g;
//     int ans = 0;
//     while(vowel > 0){
//         int four = min(n,g);
//         four /= 2;
//         int three = max(n,g);
//         three /= 2;
//         if(min(n,g) < three){
//             three = min(n,g) * 2;
//         }
//         if(4 * vowel <= cost){
//             ans += 5 * (min(vowel, four));
//             vowel -= min(vowel,four);
//             n -= four;
//             g -= four;
//             cost -= 2 * four;
//         }else if(3 * vowel <= cost){
//             ans += 3 * (min(vowel,three));
//             vowel -= min(vowel,three);
//             n -= three/2;
//             g -= three /2;
//             cost -= three;
//         }
//         else{
//             ans++;
//             vowel -= 1;
//         }
//     }
// }

signed main(){
    int t = 1;
    // cin>>t;
    while(t--)
    solve();
}