def solution(arr, divisor):
    answer = []
    for element in arr:
        if element%divisor==0:
            answer.append(element)
    if len(answer)==0:
        answer.append(-1)
    else:
        answer.sort()
    return answer
def solution2(arr,divisor):
    return sorted([n for n in arr if n%divisor == 0 ]) or [-1]