def solution(phone_number):
    answer = ''
    for i in range(len(phone_number)-4):
        answer+="*"
    for i in range(len(phone_number)-4,len(phone_number)):
        answer+=phone_number[i]
    return answer

print(solution("01033334444"))
print(solution("027778888"))