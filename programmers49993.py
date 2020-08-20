def solution(skill, skill_trees):
    answer = 0
    cnt=0
    for element in skill_trees:
        for i in range(len(skill)):
            flag=True
            for j in range(i+1,len(skill)):
                if skill[i] not in element and skill[j] in element:
                    cnt+=1
                    flag=False
                elif skill[j] not in element:
                    continue
                elif element.index(skill[i])>element.index(skill[j]):
                    cnt+=1
                    flag=False
                if not flag:
                    break
            if not flag:
                break    

    answer=len(skill_trees)-cnt
    return answer

skill="CBD"
skill_trees=["BACDE", "CBADF", "AECB", "BDA"]
print(solution(skill,skill_trees))