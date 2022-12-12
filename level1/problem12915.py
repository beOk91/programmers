def solution(strings, n):
    strings.sort()
    strings.sort(key=lambda x:x[n])
    return strings


strings=["sun", "bed", "car"]
n=1
strings2=["abce", "abcd", "cdx"]	
n2=2
print(solution(strings,n))
print(solution(strings2,n2))