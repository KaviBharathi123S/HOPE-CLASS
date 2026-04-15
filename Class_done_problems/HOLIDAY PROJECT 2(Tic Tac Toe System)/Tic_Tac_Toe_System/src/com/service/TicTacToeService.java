package com.service;
import com.model.Board;
public class TicTacToeService extends GameService {
    @Override
    public boolean checkWin(Board board, char symbol) {
        char[][] g = board.getGrid();
        // rows & columns
        for(int i=0;i<3;i++){
            if(g[i][0]==symbol && g[i][1]==symbol && g[i][2]==symbol)
                return true;
            if(g[0][i]==symbol && g[1][i]==symbol && g[2][i]==symbol)
                return true;
        }
        // diagonals
        if(g[0][0]==symbol && g[1][1]==symbol && g[2][2]==symbol)
            return true;
        if(g[0][2]==symbol && g[1][1]==symbol && g[2][0]==symbol)
            return true;
        return false;
    }
}
