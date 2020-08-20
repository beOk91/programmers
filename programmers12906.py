def solution(arr):
    answer = []
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    for i in range(len(arr)):
        if len(answer)==0:
            answer.append(arr[i])
        elif arr[i] != answer[len(answer)-1]:
            answer.append(arr[i])
    return answer

arr=[1,1,3,3,0,1,1]
print(solution(arr))