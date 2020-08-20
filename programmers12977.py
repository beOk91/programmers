def solution(nums):
    answer = 0
    arr=[]
    for i in range(len(nums)):
        for j in range(i+1,len(nums)):
            for z in range(j+1,len(nums)):
                arr.append(nums[i]+nums[j]+nums[z])
    for element in arr:
        if isPrime(element):
            answer+=1
    return answer
def isPrime(num):
    cnt=0
    for i in range(num,0,-1):
        if cnt>2:
            return False
        elif num%i==0:
            cnt+=1       
    return True if cnt==2 else False

nums=[1,2,3]
print(solution(nums))