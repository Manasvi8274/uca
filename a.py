m=int(input())
arr=[]
data=int(input())
for i in range(data):
    arr.append([i for i in input().split()])
d={}
count={}
for i in arr:
    d[i[1]]=[int(i[0]) , i[2]]
q=int(input())
l=[0]*(m)

for i in range(q):
    s=input()
    print(d[s][0])
    l[d[s][0]]+=1
    print(d[s][1],l[d[s][0]])
    

# 3
# 4
# 0 glggl www.google.com
# 0 fcbok www.facebook.com
# 2 lefts www.hackerrank.com
# 0 hckrk www.hackerrank.com
# 2
# hckrk
# lefts