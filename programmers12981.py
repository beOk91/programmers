def solution(n, words):
    answer = []
    field=[]
    for i in range(len(words)):
        if words[i] not in field:
            if i==0 or words[i-1][-1]==words[i][0]:
                field.append(words[i])
            else:
                answer=[i%n+1,i//n+1]
                break
        else:
            answer=[i%n+1,i//n+1]
            break
    if len(field) == len(words):
        answer=[0,0]
    return answer

mySet={1,2,3}
mySet.add(1)
myList=[1,2,3,4]
print(5 not in myList)