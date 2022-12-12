def solution(s):
    s=s.lower()
    s=s.split(" ")
    for i in range(len(s)):
        if len(s[i])!=0:
            s[i]=s[i][0].upper()+s[i][1:]
    return " ".join(element for element in s)

def solution2(s):
    return s.title()
s="3people unFollowed me"
print(solution(s))
s2="Hello    World"
print(solution(s2))