def solution(s):
    answer=[]
    if len(s)==1:
        return 1
    else:
        for i in range(1,len(s)//2+1):
            text,cnt,idx="",1,0
            while idx<(len(s)-len(s)%i):
                if s[idx:idx+i]==s[idx+i:idx+i*2]:
                    cnt+=1
                else:
                    text+=str("" if cnt<=1 else cnt)+s[idx:idx+i]
                    cnt=1
                idx+=i
            text+=s[idx:]
            answer.append(len(text))
        return min(answer)



print(solution("aabbaccc"))
