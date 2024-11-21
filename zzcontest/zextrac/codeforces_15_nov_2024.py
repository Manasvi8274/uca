for _ in range(int(input())):
    n=int(input())
    l=list(map(int,input().split()))
    ans=0
    fla=1
    x=n//2 if n%2 == 0 else n//2 +1
    for i in range(n):
        if(abs(l[i]-i-1) >=2):
            fla=0
    if(fla == 1):
        print("YES")
    else:
        print("NO")


# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     ans = 0
#     d={}
#     for i in range(n):
#         if(l[i] in d):
#             d[l[i]]+=1
#         else:
#             d[l[i]]=1
#     ans = 0
#     for j in d:
#         ans = max(d[j],ans)
#     print(n-ans)