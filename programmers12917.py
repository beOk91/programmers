def solution(s):
    s=list(s)
    s.sort(key=lambda x:x[0], reverse=True)
    answer=""
    for i in range(len(s)):
        answer+=s[i]
    return answer
def solution2(s):
    return "".join(sorted(list(s),reverse=True))
    

print(solution("Zbcdefg"))
print(solution2("Zbcdefg"))