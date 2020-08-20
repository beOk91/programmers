def solution(nums):
    answer=0
    pokedex={}
    for element in nums:
        pokedex[element]= (0 if pokedex.get(element)==None else pokedex[element]+1 )
    poke_cnt_Max=len(nums)//2
    answer=min(len(nums)//2,len(pokedex))
    return answer