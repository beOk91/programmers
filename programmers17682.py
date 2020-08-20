def solution(dartResult):
    score,i=[0]*3,-1
    dartResult=dartResult.replace("10","t")
    for element in dartResult:
        if element not in["S","D","T","*","#"]:
            i+=1
            score[i]=(10 if element=="t" else int(element))
        else:
            if element=="D":
                score[i]=int(score[i])**2
            elif element=="T":
                score[i]=int(score[i])**3
            elif element=="*":
                score[i]=int(score[i])*2
                if i-1>=0:
                    score[i-1]=int(score[i-1])*2
            elif element=="#":
                score[i]=int(score[i])*-1
    return sum(score)
import re
def solution2(dartResult):
    score=[0]*3
    pattern=re.compile('(\d*)([SDT])([*#]?)')
    arr1=pattern.findall(dartResult)
    arr2={"S":1,"D":2,"T":3}
    for i in range(3):
        score[i]=int(arr1[i][0])**arr2.get(arr1[i][1])*(2 if arr1[i][2]=="*" else (-1 if arr1[i][2]=="#" else 1))
        if arr1[i][2]=="*" and i>=1:
            score[i-1]*=2
    return sum(score)

dartResult="1D2S#10S"
print(solution2(dartResult))

"""
dartResult="1D2S#10S"
print(solution(dartResult))

dataResult="1D2S#10S"
p = re.compile('(\d?)([SDT])([*#])?')
dart=p.findall(dataResult)
"""