def solution(n):
    answer = 0
    for i in range(n,0,-1):
        if n%i==0:
            answer+=i
    return answer
def solution2(n):
    return sum([i for i in range(1,n+1) if n%i==0])


print(solution(12))
print(solution2(12))