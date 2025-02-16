# for _ in range(int(input())):
#     s=input()
#     s1=""
#     for i in range(1,len(s)):
#         if(s[-i]+s[-i-1] == "su"):
#             s1+=s[:-i-1] + "i"
#             break
#     print(s1)

# for _ in range(int(input())):
#     s=input()
#     flag=True
#     for i in range(1,len(s)):
#         if(s[i] == s[i-1]):
#             flag=False
#     if(flag == True):
#         print(len(s))
#     else:
#         print(1)


# for _ in range(int(input())):
#     n,m=map(int,input().split())
#     l=[]
#     if(m == 1):
#         for i in range(n):
#             l.append(int(input()))
#         l.sort(reverse = True)
#         ans=0
#         s=0
#         for i in l:
#             s+=i
#             ans+=s
#         print(ans)
#         continue
#     else:
#         for i in range(n):
#             l.append(list(map(int,input().split())))
#         for i in range(n):
#             s=0
#             for j in range(m):
#                 s+=l[i][j]
#                 l[i][j]=s
#             l[i]=l[i][::-1]
#         l.sort(reverse=True)
#         for i in range(n):
#             l[i] = l[i][::-1]
#         # print(l)
#         ans=sum(l[0])
#         # print(ans)
#         prev=l[0][-1]
#         # print(prev)
#         for i in range(1,n):
#             for j in range(m):
#                 if(j == 0):
#                     prev = prev+l[i][j]
#                 else:
#                     prev = prev + l[i][j] - l[i][j-1]
#                 ans+=prev
#             # print(ans)
#         print(ans)
    
for _ in range(int(input())):
    n,m,k=map(int,input().split())
    if(abs(n-m) > k):
        print(-1)
        continue
    if(m == 0):
        print("0"*n)
        continue
    if(n == 0):
        print("1"*m)
        continue
    if(k == 1):
        s=""
        for i in range(n+m):
            if(i%2==0):
                if(m>0):
                    s+="1"
                    m-=1
                else:
                    s+="0"
                    n-=1
            else:
                if(n>0):
                    s+="0"
                    n-=1
                else:
                    s+="1"
                    m-=1
        print(s)
        continue
    s1=""
    s=""
    if(n>m):
        s1+="0"*k
        n=n-k
    else:
        s1+="1"*k
        m=m-k
    if(m>n):
        for i in range(n+m):
            if(i%2 == 0):
                if(m>0):
                    s+="1"
                    m-=1
                else:
                    s+="0"
                    n-=1
            else:
                if(n>0):
                    s+="0"
                    n-=1
                else:
                    s+="1"
                    m-=1
    else:
        for i in range(n+m):
            if(i%2 == 0):
                if(n>0):
                    s+="0"
                    n-=1
                else:
                    s+="1"
                    m-=1
            else:
                if(m>0):
                    s+="1"
                    m-=1
                else:
                    s+="0"
                    n-=1
    print(s+s1)