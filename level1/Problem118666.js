function solution(survey, choices) {
    let result={'R':0,'T':0,'C':0,'F':0,'J':0,'M':0,'A':0,'N':0};
    for(let i=0;i<choices.length;i++){
        if(choices[i]==1) result[survey[i][0]]+=3; 
        else if(choices[i]==2) result[survey[i][0]]+=2;
        else if(choices[i]==3) result[survey[i][0]]+=1;
        else if(choices[i]==5) result[survey[i][1]]+=1;
        else if(choices[i]==6) result[survey[i][1]]+=2;
        else if(choices[i]==7) result[survey[i][1]]+=3;
    }
    return (result['R']>=result['T'] ? 'R' : 'T')+ (result['C']>=result['F'] ? 'C':'F') + (result['J']>=result['M'] ? 'J':'M')+ (result['A']>=result['N'] ? 'A': 'N');
}