# for _ in range(int(input())):
#     n,k,p = map(int,input().split())
#     if(k > p*n or k<-p*n):
#         print(-1)
#     elif(k == 0):
#         print(0)
#     else:
#         if(k<0):
#             k=-k
#         x = k//p + (1 if k%p>0 else 0)
#         print(x)

# import math
# for _ in range(int(input())):
#     n=int(input())
#     s=input()
#     c1=s.count("-")
#     c2 = n-c1
#     if(n <=2):
#         print(0)
#         continue
#     if(c1 <=1 or c2==0):
#         print(0)
#         continue
#     print((math.ceil(c1/2))*(c2) * (c1//2))

for _ in range(int(input())):
    n,x=map(int,input().split())
    bt = ""
    i=n
    while(i>0):
        if(i%2 == 0):
            bt+="0"
        else:
            bt+="1"
        i=i//2
    bt=bt[::-1]
    l=[]
    i=0
    while(len(l)<n):
        t=i
        s1=""
        while(t>0):
            if(t%2==0):
                s1+="0"
            else:
                s1+="1"
            t=t//2
        s1=s1[::-1]
        flag=True
        for j in range(len(s1)):
            if(bt[j] == "0" and s1[j] == "1"):
                flag=False
                break
        if(flag):
            l.append(i)
    print(*l)