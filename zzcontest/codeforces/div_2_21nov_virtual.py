for _ in range(int(input())):
    n=int(input())
    l=list(map(int,input().split()))
    mxar={}
    mx=0
    for i in range(n):
        mx = max(mx,l[i])
        mxar[i] = mx
    # print("mxar = ",mxar)
    mi=n-1
    mv=mxar[n-1]
    ans=[]
    for i in range(1,n+1):
        if(mi < l[-i] or mxar[n-i] > mi):
            if(mi > l[-i]):
                mi = l[-i]
            mv = max(mv , mxar[n-i])
        else:
            mi = l[-i]
            mv = mxar[n-i]
        ans.append(mv)
    ans.reverse()
    print(*(ans))

# for _ in range(int(input())):
#     n=int(input())
#     if(n<27):
#         if(n%2!=0):
#             print(-1)
#             continue
#         else:
#             l=[]
#             for i in range(1,n//2+1):
#                 l.append(i)
#                 l.append(i)
#             print(*(l))
#             continue
#     else:
#         if(n%2 != 0):
#             l=list(("2 1 3 3 2 4 4 5 5 6 6 7 7 8 8 9 9 1 10 10 11 11 12 12 13 13 1").split(" "))
#             x=14
#             n=n-27
#             for i in range(n//2):
#                 l.append(x)
#                 l.append(x)
#                 x+=1
#             print(*(l))
#         else:
#             l=[]
#             for i in range(n//2):
#                 l.append(i+1)
#                 l.append(i+1)
#             print(*(l))

# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     d={}
#     for i in l:
#         if i in d:
#             d[i]+=1
#         else:
#             d[i]=1
#     x=0
#     for i in d:
#         x=max(x,d[i])
#     print(n-x)