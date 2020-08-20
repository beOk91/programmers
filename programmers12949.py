def solution(arr1, arr2):
    answer = [[0]*len(arr2[0]) for _ in range(len(arr1))]
    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            for k in range(len(arr2)):
                answer[i][j]+=arr1[i][k]*arr2[k][j]
    return answer

def solution2(arr1, arr2):
    return [[sum(a*b for a,b in zip(arr1_row,arr2_col)) for arr2_col in zip(*arr2)] for arr1_row in arr1]

arr1=[[1,4],[3,2],[4,1]]
arr2=[[3,3],[3,3]]

arr3=[[2, 3, 2], [4, 2, 4], [3, 1, 4]]
arr4=[[5, 4, 3], [2, 4, 1], [3, 1, 1]]

arr5=[[1, 2, 3], [4, 5, 6]]
arr6=[[1, 4], [2, 5], [3, 6]]
print(solution2(arr1,arr2))
print(solution2(arr3,arr4))
print(solution2(arr5,arr6))