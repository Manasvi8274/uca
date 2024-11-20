for _ in range(int(input())):
    n,m,l = map(int,input().split())
    hurdles = []
    for i in range(n):
        a,b = map(int,input().split())
        hurdles.append([a,b])
    power = []
    for i in range(m):
        a,b = map(int,input().split())
        power.append([a,b])
    finalans = 0
    power_hold = 0
    currenthurdle = n-1
    currentpower = m-1
    while(currenthurdle >=0):
        power_need = hurdles[currenthurdle][1] - hurdles[currenthurdle][0] + power_hold + 1

        power_add = []
        stop = 0
        if(currenthurdle >0):
            stop = hurdles[currenthurdle -1][1]
        i=currentpower
        while(i >= 0 ):
            if(power[i][0] > stop and power[i][0] < hurdles[currenthurdle][0]):
                power_add.append(power[i][1])
            elif(power[i][0] > hurdles[currenthurdle][0]):
                i-=1
                continue
            else:
                currentpower = i
                break
            i-=1
        power_add.sort(reverse=True)

        ans=0
        for i in power_add:
            power_need -= i
            ans+=1
            if(power_need <= 0):
                break
        # print("ans = " ,ans)
        if(power_need <= 0):
            finalans+=ans
        else:
            power_hold +=power_need
            finalans += ans
        currenthurdle-=1
    if(power_hold >0):
        print(-1)
    else:
        print(finalans)

# for _ in range(int(input())):
#     n=int(input())
#     if(n<=4):
#         print(-1)
#         continue
#     l=[]
#     for i in range(2,n+1,2):
#         if (i != 4):
#             l.append(i)
#     l.append(4)
#     l.append(5)
#     for i in range(1,n+1,2):
#         if(i!=5):
#             l.append(i)
#     print(*(l))

# import math
# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     a,b = 0,0
#     d={}
#     for i in l:
#         if  i not in d:
#             d[i]=1
#         else:
#             d[i]+=1
#     for i in l:
#         if((n-2)/i == (n-2)//i):
#             t=(n-2)//i
#             if((t == i and d[t]>=2) or (t!=i and d[t]>=1)):
#                 a=i
#                 b=t
#             break
#         else:
#             continue
#     if(a>b):
#         print(a,b)
#     else:
#         print(b,a)

# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     d={}
#     for i in l:
#         if i not in d:
#             d[i]=1
#         else:
#             d[i]+=1
#     ans=0
#     for i in d:
#         ans+=d[i]//2
#     print(ans)