def solution(answers):
    score = [0]*3
    arr1=[1,2,3,4,5]
    arr2=[2, 1, 2, 3, 2, 4, 2, 5]
    arr3=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    for i in range(len(answers)):
        if answers[i]==arr1[i%5]:
            score[0]+=1
        if answers[i]==arr2[i%8]:
            score[1]+=1
        if answers[i]==arr3[i%10]:
            score[2]+=1 
    answer=[]
    for i in range(3):
        if max(score)==score[i]:
            answer.append(i+1)
    return answer

answers1=[1,2,3,4,5]
answers2=[1,3,2,4,2]
print(solution(answers1))
print(solution(answers2))