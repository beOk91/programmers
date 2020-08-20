def solution(scoville, K):
    answer=0
    while len(scoville)!=2:
        scoville.sort()
        if scoville[0]>=K:
            break
        newScovile=scoville.pop(0)+scoville.pop(0)*2
        scoville.append(newScovile)
        answer+=1
    return -1 if scoville[0]<K else answer

scoville=[1, 2, 3, 9, 10, 12]
K=	7
print(solution(scoville,K))