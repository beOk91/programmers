def solution(n):
    answer =""  
    n=list(str(n))
    n.sort(reverse=True)
    for element in n:
        answer+=str(element)
    return int(answer)
print(solution("118372"))