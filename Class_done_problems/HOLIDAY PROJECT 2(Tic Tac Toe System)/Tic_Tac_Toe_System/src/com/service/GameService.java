package com.service;
import com.model.Board;
public abstract class GameService {
    // abstract method (no body)
    public abstract boolean checkWin(Board board, char symbol);
    // normal method
    public boolean isDraw(Board board) {
        char[][] g = board.getGrid();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(g[i][j] == '-')
                    return false;
            }
        }
        return true;
    }
}
