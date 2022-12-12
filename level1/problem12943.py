def solution(num):
    answer = 0
    while answer!=500:
        if num==1:
            break
        num= num//2 if num%2==0 else num*3+1
        answer+=1

    if answer==500:
        return -1
    else:
        return answer