# arr={i*i:1 for i in range(5*(10**5))}
# for _ in range(int(input())):
#     n=int(input())
#     if(n*(n+1)//2 in arr):
#         print(-1)
#         continue
#     if(n == 1):
#         print(-1)
#     elif(n == 2):
#         print(2,1)
#     else:
#         l=[2,1]
#         i=3
#         while(i <= n):
#             if(i*(i+1)//2 in arr):
#                 l.append(i+1)
#                 l.append(i)
#                 i+=1
#             else:
#                 l.append(i)
#             i+=1
#         print(*l)

# #q1
# for _ in range(int(input())):
#     n=int(input())
#     print("YES" if n%3==1 else "NO")

#q3
for _ in range(int(input())):
    n,start,end=map(int,input().split())
    l=[]
    if(n == 1):
        print(start)
        continue
    for i in range(n-1):
        l1=list(map(int,input().split()))
        l.append(l1)
        
    if(start == end):
        l1=[i for i in range(1,n+1) if i!=end]
        l1.append(end)
        print(*l1)
    else:
        l1=[start]
        for i in range(1,n+1):
            if(i!=start and i!=end):
                l1.append(i)
        l1.append(end)
        print(*l1)
        continue