for _ in range(int(input())):
    n=int(input())
    s=input()
    ans=0
    cbb=s.count(')')
    cfb=0
    for i in range(1,n+1):
        if(s[-i] == '('):
            cfb+=1
        else:
            if(cbb-1 != 1):
                ans+=cfb
                if(cfb!=0):
                    cfb-=1
                cbb-=1
            else:
                if(cfb == 0):
                    break
                else:
                    ans+=cfb+1
                    break
    print(ans)