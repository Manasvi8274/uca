import math
n=int(input())
print(n+math.ceil(n/6))

# n,k = map(int,input().split())
# bonus = list(map(int,input().split()))
# benefit = list(map(int,input().split()))
# maxwork = [bonus[i]//benefit[i] for i in range(n)]
# s=sum(maxwork)
# if(s < k ):
#     print("0 "*n)
# elif(s == k):
#     print(*(maxwork))
# else:
#     k=s-k
#     for i in range(n):
#         if(k>=maxwork[i]):
#             k=k-maxwork[i]
#             maxwork[i] = 0
#         else:
#             maxwork[i] -= k
#             k=0
#         if(k == 0):
#             break
#     print(*(maxwork))

# station=0
# for _ in range(int(input())):
#     s=input().split()
#     if(s[0] == "P"):
#         station+=int(s[1])
#     else:
#         if(station < int(s[1])):
#             print("YES")
#             station = 0
#         else:
#             print("NO")
#             station = station -  int(s[1])