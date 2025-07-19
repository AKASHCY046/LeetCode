class Solution {
    public void gameOfLife(int[][] board) {
        boolean arr[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int x = find(board, i, j);
                if (board[i][j] == 1) {
                    if (x < 2 || x > 3) {
                        arr[i][j] = true;
                    }
                }
                else{
                    if(x!=3){
                        arr[i][j]=true;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (arr[i][j]) {
                    board[i][j] = 0;
                }
                else{
                    board[i][j]=1;
                } 
            }
        }
    }

    public int find(int board[][], int i, int j) {
        int c=0;
        if(i-1>=0 && j-1>=0){
            if(board[i-1][j-1]==1){
                c++;
            }
        }
        if(i-1>=0){
            if(board[i-1][j]==1){
                c++;
            }
        }

        if(i-1>=0 && j+1<board[0].length){
            if(board[i-1][j+1]==1)
            c++;
        }

        if(j-1>=0){
            if(board[i][j-1]==1){
                c++;
            }
        }

        if(j+1<board[0].length){
            if(board[i][j+1]==1){
                c++;
            }
        }

        if(i+1<board.length && j-1 >=0){
            if(board[i+1][j-1]==1){
                c++;
            }
        }

        if(i+1<board.length){
            if(board[i+1][j]==1){
                c++;
            }
        }

        if(i+1<board.length && j+1<board[0].length){
            if(board[i+1][j+1]==1)
            c++;
        }
        return c;

    }
}

/*
00 01 02
10 11 12
20 21 22 

i-1 j-1  i-1 j  i-1 j+1

i j-1     i j   i j+1

i+1 j-1  i+1 j  i+1 j+1


*/
