def solution(N, stages):
    answer = []
    for stage in range(1,N+1):
        fail,success=0,0
        for player in stages:
            if stage==player:
                fail+=1
            if stage<=player:
                success+=1
        if success==0:
            answer.append([stage,0])
        else:
            answer.append([stage,fail/success])
    answer.sort(key=lambda x:x[1], reverse=True)
    return [element[0] for element in answer]
"""
N=5
stages=[2, 1, 2, 6, 2, 4, 3, 3]	
print(solution(N,stages))

jin_N=15
jin_Stages=[4,5,4,4,4,1,2,3,8,4,1,2,4,6,7]
print(solution(jin_N,jin_Stages))
"""
jin_N2=25
jin_Stages2 = [2,1,2,6,2,4,3,3,9,1,1,2,3,5,1,5,3,5,7,7,3,4,5,10,12]
print(solution(jin_N2,jin_Stages2))