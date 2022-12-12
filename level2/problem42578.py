def solution(clothes):
    answer = {}
    item=set([])
    for element in clothes:
        answer[element[1]]= answer[element[1]]+1 if element[1] in answer else 1
        item.add(element[1])
    result=1
    for element in item:
        result*=answer[element]
    return len(clothes) if len(item)==1 else result+len(clothes)
    
arr=[["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
print(solution(arr))