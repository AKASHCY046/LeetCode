class Solution {
    public int numRookCaptures(char[][] board) {
        int x=-1;
        int y=-1;
        int co=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    x=i;
                    y=j;
                    break;
                }
            }
            if(x!=-1){
                break;
            }
        }


        // four ways we need to check up down left right
        for(int i=y;i>=0;i--){
            if(board[x][i]=='B'){
                break;
            }
            if(board[x][i]=='p'){
                co++;
                break;
            }
        }

        for(int i=y;i<8;i++){
            if(board[x][i]=='B'){
                break;
            }
            if(board[x][i]=='p'){
                co++;
                break;
            }
        }


        for(int i=x;i>=0;i--){
            if(board[i][y]=='B'){
                break;
            }
            if(board[i][y]=='p'){
                co++;
                break;
            }
        }

        for(int i=x;i<8;i++){
            if(board[i][y]=='B'){
                break;
            }
            if(board[i][y]=='p'){
                co++;
                break;
            }

        }
        return co;
    }
}