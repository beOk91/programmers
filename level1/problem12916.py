def solution(s):
    answer = False
    cnt1,cnt2=0,0
    for i in range(len(s)):
        if s[i]=='p' or s[i]=='P':
            cnt1+=1
        elif s[i]=='y' or s[i]=='Y':
            cnt2+=1
    if cnt1==cnt2:
        return True
    return answer
    
text=input()
cnt1,cnt2=0,0

print(cnt1,cnt2)