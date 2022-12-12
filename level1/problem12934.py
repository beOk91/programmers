def solution(n):
    answer = 0
    if int(n**0.5)**2==n:
        print((int(n**0.5)+1)**2)
    else:
        print(-1)
    return answer