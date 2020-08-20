def solution(n):
    answer = ''
    while n!=0:
        rest=str(n%3)
        n=n//3
        if rest=="0":
            n-=1
            rest="4"    
        answer=rest+answer
    return answer
print(solution(500000000))