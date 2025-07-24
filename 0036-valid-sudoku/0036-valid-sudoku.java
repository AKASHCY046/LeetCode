class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character>hs=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(hs.contains(board[i][j])) return false;
                hs.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character>hs=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(hs.contains(board[j][i])) return false;
                hs.add(board[j][i]);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character>hs=new HashSet<>();
                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){

                        if(board[x][y]=='.') continue;
                if(hs.contains(board[x][y])) return false;
                hs.add(board[x][y]);

                    }
                }
            }
        }
        return true;
    }
}