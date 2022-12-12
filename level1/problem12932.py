def solution(n):
    answer = []
    n=str(n)
    for i in range(len(n)-1,-1,-1):
        answer.append(int(n[i]))
    return answer
def solution2(n):
    return list(map(int,reversed(str(n))))

print(solution(12345))
print(solution2(12345))