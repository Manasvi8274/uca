for _ in range(int(input())):
    n=int(input())
    l=list(map(int,input().split()))
    l.sort()
    ans=0
    mx = l[-1]
    for i in range(n-1):
        if(l[i] + l[i+1] <= mx):
            ans+=1
        else:
            break
    ans1 = 0
    mx = l[0] + l[1]
    for i in range(1,n+1):
        if(l[-i] >= mx):
            ans1+=1
    print(min(ans,ans1))

# for _ in range(int(input())):
#     n,k=map(int,input().split())
#     if(n//2 + 1 == k):
#         print(1)
#         print(1)
#     elif(k == n or k == 1):
#         print(-1)
#         continue
#     else:
#         a,b = k-1 , n-k
#         if(a%2 !=0 and b%2!=0):
#             print(3)
#             print(1,k,k+1)
#         else:
#             print(5)
#             print(1,k-1,k,k+1,k+2)

# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     one = l.count(1)
#     zero = 2*n-one
#     # print(one,zero)
#     print((one%2 + zero%2)//2 , min(one,zero))