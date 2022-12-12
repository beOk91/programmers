def solution(x, n):
    answer = []
    cnt=1
    answer.append(x)
    while cnt!=n:
        answer.append(answer[len(answer)-1]+x)
        cnt+=1
    return answer
def solution2(x, n):
    return [i * x + x for i in range (n)]