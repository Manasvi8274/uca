for _ in range(int(input())):
    n=int(input())
    l=list(map(int,input().split()))
    c=n
    ans=0
    count=0
    count1=0
    for i in range(1,n+1):
        if(count < l[-i]):
            count+=1
        elif(count == l[-i] or count1 == l[-i]):
            ans=0
            # print("zero at",l[-i],count1)
            count=0
        elif(count > l[-i]):
            ans+= count-l[-i]
            count1+=1
            count=0
        count1+=1
        count+=1
    print(count-1,ans)