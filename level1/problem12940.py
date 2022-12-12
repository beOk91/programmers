def solution(n, m):
    answer = []
    n1,m1=n,m
    n,m,r=m if n<=m else n,n if n<=m else m,1
    while r>0:
        r=n%m
        n,m=m,r
    answer=[n,n1//n*m1]
    return answer