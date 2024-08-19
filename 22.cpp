#include<iostream>
#include<bits/stdc++.h>
using namespace std;

//N-QUEENS PROBLEM
//2things 
//we have to check if a queen can be placed here is either safe(no interference) or correct(no problem for placement in future)
//if we check the current if we cannot place the queen in all j then we go back and move queen further in j and so on until all are done

// int main(){
//     int n=3;
//     cin>>n;
//     int arr[n][n]={0};

//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             cout<<arr[i][j]<<" ";
//         }
//         cout<<endl;
//     }
// }




void printarr(int arr[][20],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}

bool check(int board[][20],int n,int i,int j){
    //col
    for(int k=0;k<i;k++){
        if(board[k][j]==1){
            return false;
        }
    }
    //left diagonal
    int x=i;
    int y=j;
    while(x>=0 && y>=0){
        if(board[x--][y--]==1){
            return false;
        }
    }
    //right diagonal
    x=i;
    y=j;
    while(x>=0 && y<n){
        if(board[x--][y++]){
            return false;
        }
    }
    return true;
}

bool queen(int board[][20],int n,int i){
    if(i==n){//base
        printarr(board,n);
        return true;
    }

    //op
    for(int j=0;j<n;j++){
        if(check(board,n,i,j)){
            board[i][j]=1;
            bool success=queen(board,n,i+1);
            if(success){
                return true;
            }
            else{
                board[i][j]=0;
            }
        }
    }
    return false;
}

int main(){
    int n;
    cin>>n;
    int board[20][20]={0};
    queen(board,n,0);
}