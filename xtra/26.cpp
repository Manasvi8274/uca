#include <iostream>
#include <bits/stdc++.h>

using namespace std;

// to find number of ways to put n queen into nxn board

void printarr(int arr[][20], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl;
}

bool check(int board[][20], int n, int i, int j)
{
    // col
    for (int k = 0; k < i; k++)
    {
        if (board[k][j] == 1)
        {
            return false;
        }
    }
    // left diagonal
    int x = i;
    int y = j;
    while (x >= 0 && y >= 0)
    {
        if (board[x--][y--] == 1)
        {
            return false;
        }
    }
    // right diagonal
    x = i;
    y = j;
    while (x >= 0 && y < n)
    {
        if (board[x--][y++])
        {
            return false;
        }
    }
    return true;
}

int queen(int board[][20], int n, int i)
{
    if (i == n)
    { // base
        printarr(board, n);
        return 1;
    }
    int count = 0;
    // op
    for (int j = 0; j < n; j++)
    {
        if (check(board, n, i, j))
        {
            board[i][j] = 1;
            count = count + queen(board, n, i + 1);
            // if(success){
            // return 1;
            // }
            // else{
            board[i][j] = 0;
            // }
        }
    }
    return count;
}

int main()
{
    int n;
    cin >> n;
    int board[20][20] = {0};
    int x = queen(board, n, 0); // code get stuck after 9 as it is making TLE as it high time as its taking nc1 to 1c1 sum time
    cout << x;
}

// //grid base problem

// int grid(int row,int col,int i,int j,string str){
//     if(i>row-1 || j>col-1){
//         return 0;
//     }
//     if(i==row-1 && j==col-1){
//         cout<<str<<endl;
//         return 1;
//     }
//     int c=0;

//     c+=grid(row,col,i+1,j,str+"R");
//         // c+=ratinmaze(row,col,i+1,j+1);
//     c+=grid(row,col,i,j+1,str+"D");
//     return c;
// }

// int main(){
//     int n,m;
//     cin>>m>>n;
//     // string str;
//     int x=grid(m,n,0,0,"");//row,col,i,j
//     cout<<x;
// }