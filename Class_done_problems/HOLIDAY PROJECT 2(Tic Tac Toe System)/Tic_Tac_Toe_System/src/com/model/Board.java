package com.model;
public class Board {
    private char[][] grid;
    public Board() {
        grid = new char[3][3];
        initializeBoard();
    }
    public void initializeBoard() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j] = '-';
            }
        }
    }
    public void printBoard() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public boolean placeMove(int row, int col, char symbol) {
        if(grid[row][col] == '-') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }
    public char[][] getGrid() {
        return grid;
    }
}