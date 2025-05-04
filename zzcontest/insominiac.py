# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     l.sort()
#     start=l[0]
#     end=l[1]+1
#     ans=start
#     for i in range(start , end):
#         c=0
#         for j in l:
#             if(j%i !=0):
#                 c+=1
#                 if(c>1):
#                     break
#         if(c<=1):
#             ans=max(ans,i)
#     print(ans)


# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     mx=max(l)
#     d={}
#     d[1]=0
#     for i in l:
#         d[1]+=1
#         # print(i)
#         if(i not in d):
#             d[i]=1
#         else:
#             d[i]+=1
#         for j in range(1,int(i//2) + 1):
#             if(i%j == 0):
#                 d[j]=1 if j not in d else d[j]+1
#     l1=0
#     # print(d)
#     for i in d:
#         if(d[i] >=n-1):
#             l1=max(l1,i)
#     print(l1)

# def fun(n):
#     l=[1,n]
#     for i in range(2,int(n**0.5) +1):
#         if(n%i == 0):
#             l.append(i)
#     return l

# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     l1=l.copy()
#     mn1=min(l1)
#     l1.remove(mn1)
#     while(min(l1) == mn1 and len(l1) >1):
#         l1.remove(mn1)
#     mn2 = min(l1)
#     div=list(set(fun(mn1) + fun(mn2)))
#     div.sort(reverse = True)
#     for i in div:
#         flag=True
#         c=0
#         for j in l:
#             if(j%i != 0):
#                 c+=1
#                 if(c>1):
#                     flag=False
#                     break
#         if(flag):
#             print(i)
#             break

# def gcd(a,b):
#     if(b == 0):
#         return a
#     else:
#         return gcd(b,a%b)

# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     g=0
#     for i in range(1,n):
#         g=gcd(l[i-1] , l[i])
#     ans=g
#     i=2
#     while(True):
#         t=g*i
#         flag=True
#         c=0
#         for i in l:
#             if(i%t != 0):
#                 c+=1
#                 if(c>1):
#                     flag=False
#                     break
#         if(not flag):
#             break
#         ans=t
#         i+=1
#     print(ans)

for _ in range(int(input())):
    n=int(input())
    s=input()
    if(n == 2 and (s=="01" or s=="10")):
        print(0)
        continue
    a=s.count("1")
    b=n-a
    cut=0
    for i in range(2,n):
        s1=s[i-2]+s[i-1]+s[1]
        if(s1 == "101" or s1 == "010"):
            cut+=1
            # print("JI")
    print(max(n-2*cut-1 , a-1,b-1))   