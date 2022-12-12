def solution(x):
    answer = False
    num1=sum(int(i) for i in str(x))
    if x%num1==0:
        answer=True
    return answer

print(solution(10))
print(solution(12))
print(solution(11))
print(solution(13))