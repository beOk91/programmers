def solution(a, b):
    dayCntof2016=[31,29,31,30,31,30,31,31,30,31,30,31]
    dayoftheweek=["THU","FRI","SAT","SUN","MON","TUE","WED"]
    return dayoftheweek[(sum(dayCntof2016[:a-1])+b)%7]
print(solution(5,24))