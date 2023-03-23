function solution(babbling) {
    var answer = 0;
    let pronounce = ["aya", "ye", "woo", "ma"];
    for(let i=0;i<babbling.length;i++){
        for(let j=0;j<pronounce.length;j++){
            babbling[i] = babbling[i].replaceAll(pronounce[j], '1');
            if(babbling[i].indexOf('11')==-1) 
                babbling[i] = babbling[i].replaceAll('1', ' ');

        }
        babbling[i] = babbling[i].replaceAll(' ', '');
        if(babbling[i] == '' )  answer++; 
    }

    return answer;
}