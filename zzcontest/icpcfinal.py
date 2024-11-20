for _ in range(int(input())):
    n=list(map(int,input().split()))
    for i in n:
        ans=0
        t=4
        while(t<i):
            if(i%t == 0):
                ans+=1
            else:
                break
            t=t*2
        print(ans)

# for _ in range(int(input())):
#     n,k = map(int,input().split())
#     l=list(map(int,input().split()))
#     l.sort()
#     s=0
#     t=0
#     ans=[]
#     for i in range(n):
#         s+=l[i]
#         c=0
#         j=i-k
#         while(j>=0):
#             c+=l[j]
#             j=j-k-1
#         ans.append(s-c)
#         print()
#     print(*ans)