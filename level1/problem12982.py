def solution(d, budget):
    answer=sum(d)
    d.sort()
    while answer>budget:
        answer-=d.pop()
    return len(d)

d=[1,3,2,5,4]
budget=9
d2=[2,2,3,3,1,6]
budget2=11
print(solution(d,budget))
print("----------------")
print(solution(d2,budget2))