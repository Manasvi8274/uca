for _ in range(int(input())):
    l,r=map(int,input().split())
    ans=0
    for j in range(l,r+1):
        s = bin(j)[2:]
        c=-1
        c1=0
        flag=1
        prev =-1
        for i in s:
            if(i == '1'):
                if(prev == -1 or prev == 1):
                    c1+=1
                    prev=1
                if(prev == 0):
                    if(c == -1):
                        c=c1
                    else:
                        if(c != c1):
                            flag=0
                            break
                    c1=1
                    prev=1
            else:
                if(prev == -1 or prev == 0):
                    c1+=1
                    prev=0
                if(prev == 1):
                    if(c == -1):
                        c=c1
                    else:
                        if(c != c1):
                            flag=0
                            break
                    c1=1
                    prev=0
        if((flag == 1 and c==c1) or c == -1):
            ans+=1
    print(ans)

# for _ in range(int(input())):
#     l,r=map(int,input().split())
#     for i in range(l,r+1):
#         ans=0
#         flag=1
#         n=i
#         c=-1
#         c1=0
#         one=0
#         zero=0
#         while(n>0):
#             if(n%2 == 1):
#                 if(zero == 0 and one == 0):
#                     c1+=1
#                 elif(one == 1):
#                     c1+=1
#                 else:
#                     if(c == -1):
#                         c = c1
#                     else:
#                         if(c == c1):
#                             c1=0
#                             continue
#                         else:
#                             flag=0
#                             break
#             else:
#                 if(zero == 0 and one == 0):
#                     c1+=1
#                 elif(zero == 1):
#                     c1+=1
#                 else:
#                     if(c == -1):
#                         c=c1
#                     else:
#                         if(c == c1):
#                             c1=0
#                             continue
#                         else:
#                             flag=0
#                             break
#             n=n/2
#         if(flag == 1):
#             print(i,end=" ")
#             ans+=1
#     print("\n",ans)
                    

# for _ in range(int(input())):
#     n,k = map(int,input().split())
#     l=list(map(int,input().split()))
#     d={}
#     for i in l:
#         if(i in d):
#             d[i]+=1
#         else:
#             d[i]=1
#     if(len(d) == n or n-len(d) <= k):
#         print(int(n*(n-1)/2))
#         continue
#     ans = 0
#     for i in range(n-1):
#         d[l[i]]-=1
#         ans += n-i-d[l[i]]-1
#     print(ans + k)