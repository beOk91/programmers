def solution(board, moves):
    answer = 0
    basket=[]
    for move in moves:
        for size in range(len(board)):
            if board[size][move-1]!=0:
                basket.append(board[size][move-1])
                board[size][move-1]=0
                break
        if len(basket)>=2:
            if basket[len(basket)-1]==basket[len(basket)-2]:
                basket.pop()
                basket.pop()
                answer+=2
    return answer

board=[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
moves=[1,5,3,5,1,2,1,4]
print(solution(board,moves))