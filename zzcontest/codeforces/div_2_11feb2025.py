# # for _ in range(int(input())):
# #     x,y=map(int,input().split())
# #     if(x == y):
# #         print("NO")
# #         continue
# #     if(x-y>=1 and x-y<=9):
# #         print("YES")
# #         continue
# #     if(y - x == 1):
# #         print("YES")
# #         continue
# #     if(y-x >1):
# #         print("NO")
# #         continue
# #     if(x>y and (x-y+1)%9 == 0):
# #         print("YES")
# #         continue
# #     if(x>y and (x-y+1)%9 != 0):
# #         print("NO")
# #         continue

# for _ in range(int(input())):
#     n=int(input())
#     l=list(map(int,input().split()))
#     if(n == 2 and l[0] == l[1]):
#         print("YES")
#         continue
#     elif(n == 2 and l[0]!=l[1]):
#         print("NO")
#         continue
#     d={}
#     l.sort()
#     for i in l:
#         if i not in d:
#             d[i]=1
#         else:
#             d[i]+=1
#     ext=0
#     prev=-1
#     flag=True
#     for i in d:
#         if(prev == -1):
#             if(d[i] >=2):
#                 ext+=d[i]-2
#             else:
#                 flag = False
#                 break
#         else:
            
#             ext = (ext - ((i-prev-1)*2+1) if ext!=0 else 0)
#             if(ext <0):
#                 flag=False
#                 break
#             ext += (d[i]-2 if d[i]>=2 else 0)
#         prev = i
#     if(flag):
#         print("YES")
#     else:
#         print("NO")

for _ in range(int(input())):
    n=int(input())
    s=str(n)
    if(s.count("7")>0):
        print(0)
        continue
    elif(s.count("8")>8):
        print(1)
        continue
    l=[]
    for i in range(1,10):
        l.append("9"*i)
    c=0
    for i in l:
        n=n+int(i)
        # print(n)
        if(str(n).count("7")>0):
            break
        c+=1
    print(c+1)