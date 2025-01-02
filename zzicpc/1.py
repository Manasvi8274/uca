# for _ in range(int(input())):
#     n,k=map(int,input().split())
#     l=list(map(int,input().split()))
#     peak=[]
#     mn=l[0]
#     for i in range(1,n-1):
#         mn=min(mn,l[i])
#         if(l[i]>l[i+1] and l[i]>l[i-1]):
#             peak.append(mn)
#             peak.append(l[i])
#             mn=l[i+1]
#     if(len(peak)!=0):
#         peak.append(mn)
    
#     if(len(peak) == 0):
#         print(*(l[:k]))
#         continue
    
#     elif(len(peak) >= k):
#         # print("hlo")
#         print(*(peak[:k]))
#     else:
#         # print("else")
#         x=k-len(peak)
#         ans=[]
#         pkindex=0
#         for i in l:
#             if(pkindex<len(peak) and i == peak[pkindex]):
#                 ans.append(peak[pkindex])
#                 pkindex+=1
#                 continue
#             if(x>0):
#                 ans.append(i)
#                 x-=1
#         print(*(ans))


for _ in range(int(input())):
    n,m=map(int,input().split())
    l=[]
    for i in range(n):
        l.append(input())
    print(l)
    mat=[]
    for i in range(n):
        inmat=[]
        for j in range(n):
            if(j == i):
                inmat.append(0)
            else:
                inmat.append(sum([1 for k in range(m) if(l[i][k] != l[j][k])]))
        mat.append(inmat)
    for i in mat:
        print(*(i))
    matsum=[sum(i) for i in mat]
    print(matsum)