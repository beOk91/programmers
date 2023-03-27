function solution(keymap, targets) {
    var dist = [];
    let result = [];
    for(let i=0;i<keymap.length;i++){
        for(let j=0;j<keymap[i].length;j++){ 
        dist[keymap[i][j]]=dist[keymap[i][j]] == undefined ? j+1 : Math.min(dist[keymap[i][j]],j+1);            
        }
    }
    
    for(let i=0;i<targets.length;i++){
        let temp=0;
        for(let j=0;j<targets[i].length;j++){
            if(dist[targets[i][j]] == undefined) {
                temp=0; break;                                
            }else{
                temp+=dist[targets[i][j]];
            }
        }
        result.push(temp==0 ? -1: temp);
    }
    return result;
}