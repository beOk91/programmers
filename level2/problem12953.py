def solution(arr):
    if len(arr)>2:
        a=arr.pop()
        b=arr.pop()
        arr.append(a//gcd(a,b)*b)
        return solution(arr)
    else:
        a=arr.pop()
        b=arr.pop()
        return a*b//gcd(a,b)
def gcd(a,b):
    if a==0:
        return b
    return gcd(b%a,a)