# for _ in range(int(input())):
#     n=int(input())
#     l1=list(map(int,input().split()))
#     l2=list(map(int,input().split()))
#     s1=set(l1)
#     s2=set(l2)
#     print("YES" if len(s1)+len(s2)>=4 else "NO")

for _ in range(int(input())):
    n,k=map(int,input().split())
    l=list(map(int,input().split()))
    ans=k+1
    if(n<=2):
        if(l == [2,1]):
            print(2)
            continue
        if(k == 2 and l!=[1,1]):
            print(1)
            continue
        else:
            print(2)
            continue
    elif(n == k):
        ans=n
        l1=[l[i] for i in range(n) if i%2!=0]
        l1.append(0)
        for i in range(len(l1)):
            if(i+1!=l1[i]):
                ans=min(ans,i+1)
        print(ans)
        continue
    else:
        for i in range(1,n-k+2):
            if(l[i]!=1):
                ans=1
                break

        if(ans==1):
            print(ans)
            continue
        else:
            print(2)
            continue