#############Question 1
# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     if(l.count(0) == n):
#         print(0)
#         continue
#     else:
#         flag=False
#         c=0
#         for i in l:
#             if(i!=0 and flag == False):
#                 flag=True
#                 c+=1
#             elif(i == 0 and flag==True):
#                 flag=False
#                 c+=1
#         if(c <= 2):
#             print(1)
#         else:
#             print(2)

###############Question 2
for _ in range(int(input())):
    n=int(input())
    s=input()
    if(s.count("s")==0 or s.count("p") == 0):
        print("YES")
        continue
    if(".sp." in s or ".spp" in s or ".sps" in s):
        print("NO")
        continue
    s1=""
    for i in s:
        if(s != "."):
            s1+=i
    if("ps" in s1 or "sspp" in s1):
        print("NO")
    else:
        print("YES")