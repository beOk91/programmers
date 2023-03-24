function solution(park, routes) {
    var answer = [0,0];
    for(let i=0;i<park.length;i++){
        for(let j=0;j<park[i].length;j++)
            if(park[i][j]== 'S') {
                answer[0] = i;
                answer[1] =j; 
                break;
            }
    }
    for(let i=0;i<routes.length;i++){
        let r = routes[i].split(' ');
        if(r[0] == 'E'){
            if(answer[1]+parseInt(r[1])<park[0].length) {
                for(let j=1;j<=parseInt(r[1]);j++){
                    if(park[answer[0]][answer[1]+j]=='X') break;
                    if(j==parseInt(r[1])) answer[1]+=parseInt(r[1]);
                }
            }
        }else if(r[0] == 'W'){
            if(answer[1]-parseInt(r[1])>=0 ) {
                for(let j=1;j<=parseInt(r[1]);j++){
                    if(park[answer[0]][answer[1]-j]=='X') break;
                    if(j==parseInt(r[1])) answer[1]-=parseInt(r[1]);
                }
    
            }
        }else if(r[0] == 'S'){
            if(answer[0]+parseInt(r[1])<park.length ) {
                for(let j=1;j<=parseInt(r[1]);j++){
                    if(park[answer[0]+j][answer[1]]=='X') break;
                    if(j==parseInt(r[1])) answer[0]+=parseInt(r[1]);
                }
            }
        }else {
            if(answer[0]-parseInt(r[1])>=0 ) {
                for(let j=1;j<=parseInt(r[1]);j++){
                    if(park[answer[0]-j][answer[1]]=='X') break;
                    if(j==parseInt(r[1])) answer[0]-=parseInt(r[1]);
                }
            }
        }
    }
    return answer;
}