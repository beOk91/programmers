def solution(participant, completion):
    participant.sort()
    completion.sort()
    for i in range(len(completion)):
        if completion[i]!=participant[i]:
            return participant[i]
    return participant[len(participant)-1]

arr=["leo", "kiki", "eden"]
arr2=["eden", "kiki"]
print(solution(arr,arr2))

for element in completion:
    participant.remove(element)
return participant[0]