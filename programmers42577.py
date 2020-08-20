def solution(phone_book):
    answer = True
    phone_book.sort(key=lambda x:len(x))
    for i in range(1,len(phone_book)):
        if phone_book[0] == phone_book[i][0:len(phone_book[0])]:
            answer= False
    return answer