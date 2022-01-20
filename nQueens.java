import java.util.*;

public class nQueens
{
    public static boolean isSafe(int row, int colomn, char [][] board) {
        
        // horizontal
        for(int i=0; i<board.length; i++) {
            if(board[row][i] == 'Q') {
                return false;
            }
        }
        
        // verticle
        for(int i=0; i<board.length; i++) {
            if(board[i][colomn] == 'Q') {
                return false;
            }
        }
        
        // down-right
        int r = row;
        for(int c = colomn; r<board.length && c<board.length; c++,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        // down-left
        r= row;
        for(int c=colomn; r>=0 && c<board.length; c++,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        // up-right
        r= row;
        for(int c=colomn; r<board.length && c>=0; c--,r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        
        // up-left
        r = row;
        for(int c = colomn; r>=0 && c>=0; c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        // if no above is apply
        return true;
    }
    public static void saveBoard(char [][] board, List<List<String>> allBoards) {
        String row = ""; // represents individual rows which is updated in every loop
        ArrayList<String> newBoard= new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q') {
                    row += 'Q';
                }
                else row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static void helper(char [][] board, List<List<String>> allBoards, int colomn) {
        
        if(colomn == board.length) {
            saveBoard(board, allBoards); // copy from 2-D array board to ArrayList allBoards
            return;
        }
        for(int row = 0; row<board.length; row++) {
            if(isSafe(row, colomn, board)) {
                board[row][colomn] = 'Q';
                helper(board, allBoards, colomn+1);
                board[row][colomn] = '.'; // make Q to . while backtracking
            }
        }
    }
    public static List<List<String>> solveQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char [][] board = new char[n][n];
        
        helper(board, allBoards, 0);
        return allBoards;
    }
	public static void main(String[] args) {
	      int n = 4;
	      List<List<String>> allBoards = new ArrayList<>();
	      allBoards = solveQueen(n);
	      System.out.println(allBoards);
	}
}
