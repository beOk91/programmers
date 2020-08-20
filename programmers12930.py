def solution(s):
    answer = s.split(" ")
    for i in range(len(answer)):
        newValue=""
        for j in range(len(answer[i])):
            if j%2==0:
                newValue+=answer[i][j].upper()
            else:
                newValue+=answer[i][j].lower()

        answer[i]=newValue

    return " ".join(answer)

print(solution("try hello world"))
print(solution("try hellodasdf world dd "))
print(solution("try hello world"))

text1="hello python ".split()
text2="hello python ".split(" ")
print(text1)
print(text2)