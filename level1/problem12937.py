def solution(num):
    answer = ''
    if num%2==0:
        answer="Odd"
    else:
        answer="Even"
    return answer
def solution2(num):
    return "Odd" if num%2==0 else "Even"
num=int(input())
print(solution(num))
print(solution2(num))