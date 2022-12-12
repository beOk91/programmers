def solution(numbers):
    answer = ''
    numbers.sort(key=lambda x:int(str(x)[0]),reverse=True)
    print(numbers)
    print(numbers)
    for element in numbers:
        answer+=str(element)
    return answer
print(solution([6,10,2]))

print(solution([3, 30, 34, 5, 9]))