// class Solution {

// int getDistance(char c1, char c2) {

//     if (c1 == '\0' || c2 == '\0') {
//         return 0;
//     }

//     int dp[26][2];
//   // Assign values individually
//     dp[0][0] = 0; dp[0][1] = 0; // A
//     dp[2][0] = 0; dp[2][1] = 2; // C
//     dp[4][0] = 0; dp[4][1] = 4; // E
//     dp[10][0] = 1; dp[10][1] = 4; // K
//     dp[7][0] = 1; dp[7][1] = 1; // H
//     dp[15][0] = 2; dp[15][1] = 3; // P
//     dp[24][0] = 4; dp[24][1] = 0; // Y



    
//     return abs(dp[c1 - 'A'][0] - dp[c2 - 'A'][0])  + abs(dp[c1 - 'A'][1] - dp[c2 - 'A'][1]);
// }

// int backTrackMinimumDistance(int idx, string word, char f1, char f2) {

//     // Exit Condiiton
//     if (word[idx] == '\0') { // idx == word.length()
//         return 0;
//     }

//     int choice1 = getDistance(word[idx], f1) + backTrackMinimumDistance(idx + 1, word, word[idx], f2);
//     int choice2 = getDistance(word[idx], f2) + backTrackMinimumDistance(idx + 1, word, f1, word[idx]);
    
//     return choice1 <= choice2 ? choice1 : choice2;
// }

// public:
//     int minimumDistance(string word) {
//         return backTrackMinimumDistance(0, word, '\0', '\0');
//     }
// };

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    // int *ar1 = (int*)malloc(sizeof(int)*20);
    // for(int i=0;i<5;i++){
    //     cout<<ar1[i]<<"\t";
    // }
    // cout<<endl;
    // int *ar2 = (int *)calloc(sizeof(int),20);
    // for (int i = 0; i < 5; i++)
    // {
    //     cout << ar2[i] << "\t";
    // }
    // cout << endl;

    int *ar1 = (char *)malloc(sizeof(char) * 20);
    for (int i = 0; i < 5; i++)
    {
        cout << ar1[i] << "\t";
    }
    cout << endl;
}