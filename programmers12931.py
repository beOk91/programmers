def solution(n):
    answer = 0
    for i in range(len(str(n))):
        answer+=int(str(n)[i])
    return answer
def solution2(n):
    return sum(map(int,str(n)))

print(solution(123))
print(solution2(123))