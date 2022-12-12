def solution(s):
    if len(s)==4 or len(s)==6:
        for i in range(len(s)):
            if s[i] not in "0123456789":
                return False
    else:
        return False
    return True
def solution2(s):
    return s.isdigit() and len(s) in (4,6)

s="0123"
print(s.isdecimal())
print(s.isdigit())
print(s.isnumeric())

s2="½"
print(s2.isdecimal())
print(s2.isdigit())
print(s2.isnumeric())
