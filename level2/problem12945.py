import sys
sys.setrecursionlimit(10000)
arr=[0]*100001
arr[0]=0
arr[1]=1

def solution(n):
    if n==1 or n==2:
        return 1
    else:
        if arr[n]!=0:
            return arr[n]%1234567
        else:
            arr[n]=solution(n-1)+solution(n-2)
            return arr[n]%1234567

print(solution(2))
print(solution(5))