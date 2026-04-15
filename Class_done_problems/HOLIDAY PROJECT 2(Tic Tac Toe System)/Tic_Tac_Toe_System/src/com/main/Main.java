package com.main;    
    import java.util.Scanner;
    import com.model.*;
    import com.service.*;
    import com.util.GameHistory;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player p1 = new Player("Player1", 'X');
        Player p2 = new Player("Player2", 'O');
        GameHistory history = new GameHistory();
        // POLYMORPHISM (parent reference, child object)
        GameService service = new TicTacToeService();
        boolean playAgain = true;
        while(playAgain) {
            Board board = new Board();
            Player current = p1;
            while(true) {
                board.printBoard();
                System.out.println(current.getName() + " enter row and col:");
                int r = sc.nextInt();
                int c = sc.nextInt();
                if(!board.placeMove(r, c, current.getSymbol())) {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
                if(service.checkWin(board, current.getSymbol())) {
                    board.printBoard();
                    System.out.println(current.getName() + " wins!");
                    history.addResult(current.getName() + " won");
                    break;
                }
                if(service.isDraw(board)) {
                    board.printBoard();
                    System.out.println("Draw!");
                    history.addResult("Draw");
                    break;
                }
                current = (current == p1) ? p2 : p1;
            }
            System.out.println("Play again? (true/false)");
            playAgain = sc.nextBoolean();
        }
        history.showHistory();
        history.showLatestFirst();
        sc.close();
    }
}

