def solution(n, arr1, arr2):
    map1 = [[0]*n for i in range(n)]
    for i in range(len(arr1)):
        num=make_binary_num(arr1[i])
        num=list(num)
        for j in range(n-1,n-len(num)-1,-1):
            map1[i][j]=num[j-n+len(num)]
    map2 = [[0]*n for i in range(n)]
    for i in range(len(arr2)):
        num=make_binary_num(arr2[i])
        num=list(num)
        for j in range(n-1,n-len(num)-1,-1):
            map2[i][j]=num[j-n+len(num)]
    answer=[]
    for i in range(n):
        text=""
        for j in range(n):
            if map1[i][j] =="1" or map2[i][j]=="1":
                text+="#"
            else:
                text+=" "
        answer.append(text)
    return answer

def make_binary_num(num):
    if num<=1:
        return str(num)
    else:
        return make_binary_num(num//2)+str(num%2)

def solution2(n, arr1, arr2):
    answer=[]
    for i in range(n):
        text=str(bin(arr1[i]|arr2[i])[2:]).zfill(n)
        text=text.replace("1","#")
        text=text.replace("0"," ")
        answer.append(text)
    return answer


n,arr1,arr2=5,[9,20,28,18,11],[30, 1, 21, 17, 28]
print(solution(n,arr1,arr2))

print(solution2(n,arr1,arr2))

str(bin(9|9))[2:].zfill(5)