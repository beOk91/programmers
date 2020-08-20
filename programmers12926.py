def solution(s, n):
    answer = ''
    for element in s:
        if element >='a' and element<='z':
            caesar_code=chr(ord(element)+n)
            if caesar_code>'z':
                caesar_code=chr(ord(caesar_code)-26)
            answer+=caesar_code
        elif element >='A' and element<='Z':
            caesar_code=chr(ord(element)+n)
            if caesar_code>'Z':
                caesar_code=chr(ord(caesar_code)-26)
            answer+=caesar_code
        else:
            answer+=element
    return answer

def solution2(s,n):
    answer=''
    for element in s:
        if element.islower():
            answer+=chr((ord(element)-ord('a')+n)%26+ord('a'))
        elif element.isupper():
            answer+=chr((ord(element)-ord('A')+n)%26+ord('A'))
        else:
            answer+=element
    return answer
print(solution("aaaaa Z z",1))
print(solution("z Z z",2))