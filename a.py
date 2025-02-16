for _ in range(int(input())):
    n=int(input())
    s=input()
    ans=0
    for i in range(1,n):
        if(s[i-1] == '1'  and s[i] == '0'):
            ans+=2
    if(s[-1] == '1'):
        ans+=1
    print(ans)
    continue