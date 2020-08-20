def solution(p):
    stack,idx=[],0
    text1,text2=0,0
    while idx!=len(p):
        if text1!=0 and text1==text2:
            break
        elif p[idx]=="(":
            text1+=1
        elif p[idx]==")":
            text2+=1
        idx+=1
        print(text1,text2,idx)
    #print(solution(p[:idx]))
    #print(solution(p[idx:]))
    return 0
    #return solution(p[:idx])+solution(p[idx:])


print(solution("(()())()"))
print("------------------")
print(solution("()))((()"))