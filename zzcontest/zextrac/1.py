# disc shop
# for _ in range(int(input())):
#     n=int(input())
#     rev = 0
#     i=0
#     mn = n
#     while(n>0):
#         d=n%10
#         n=n//10
#         mn = min(mn , n*pow(10,i) + rev)
#         rev = d*pow(10,i) +rev
#         i+=1
#     print(mn)
# s=input()


# helloworld
# print("Hello world!")



# order teams
# for _ in range(int(input())):
#     l1=list(map(int,input().split()))
#     l2=list(map(int,input().split()))
#     l3=list(map(int,input().split()))
#     l=[]
#     l.append(l1)
#     l.append(l2)
#     l.append(l3)
#     l.sort(reverse = True)
#     flag=True
#     if((l[0] == l[1]) or (l[1] == l[2]) or (l[0] == l[2])):
#         print("no")
#         continue
#     for i in range(3):
#         if((l[0][i] < l[1][i]) or (l[1][i] < l[2][i]) or (l[0][i] < l[2][i])):
#             flag = False
#             break
#     if(flag):
#         print("yes")
#     else:
#         print("no")

# PENS
# for _ in range(int(input())):
#     n,k=map(int,input().split())
#     s=input()
#     dic = {}
#     for i in range(k):
#         z=input()
#         z = ''.join(sorted(z))
#         dic[i+1] = z
#     ans =[]
#     prev=0
#     anslength = 0
#     while(anslength < n):
#         sub1=""
#         key = 0
#         l=0
#         ff=0
#         for i in range(prev,n):
#             l+=1
#             if(s[i] in sub1):
#                 continue
#             sub2 = sub1+s[i]
#             sub2 = ''.join(sorted(sub2))
#             print(sub2)
#             flag=True
#             for j in dic:
#                 flagsubs = 1
#                 for subs in sub2:
#                     if subs not in dic[j]:
#                         flagsubs = 0
#                         break
#                 if(flagsubs):
#                     key = j
#                     flag = False
#                     break
#             if(flag == False):
#                 sub1 = sub2
#                 if(i == n-1):
#                     ff=1
#                     break
#                 continue
#             else:
#                 # print(s[i])
#                 prev=i
#                 break
#         if(ff==1):
#             ans.append([key,l])
#             anslength = anslength + (l)
#         elif(prev<n):
#             ans.append([key,l-1])
#             anslength = anslength +  (l-1)
#         else:
#             ans.append([key,l])
#             anslength = anslength + (l)
#         # print(ans,anslength)
#     i=0
#     # print(ans)
#     ansstr=""
#     c=0
#     while(c<n):
#         for j in range(ans[i][1]):
#             ansstr += (str(ans[i][0])+' ')
#             c+=1
#             if(c==n):
#                 break
#         i+=1
#     print(ansstr)