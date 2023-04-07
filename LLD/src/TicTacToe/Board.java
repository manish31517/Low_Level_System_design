package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
   private int size;
    private PlayingPiece [][] board;
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public  boolean addPiece(int row ,int column, PlayingPiece playingPiece){
        if(board[row][column] != null) {
            return false;
        }

        board[row][column] = playingPiece;
        return true;
    }

    public List<Pair<Integer,Integer>> findFreeCell(){

          List<Pair<Integer,Integer>> free = new ArrayList<>();

          for(int i = 0; i < size; i++){
              for(int j = 0; j < size; j++){
                   if(board[i][j]==null){
                       Pair<Integer,Integer> p = new Pair<>(i,j);
                       free.add((p));
                   }
              }
          }
          return free;
    }

    public  void printBoard(){
         for(int i  = 0; i < size; i++){
             for(int j = 0; j< size; j++){
                 System.out.print((board[i][j]!= null ? board[i][j].pieceType : " ")+"\t |");
             }
             System.out.println();
         }
    }
    public  boolean isThereWinner(int row, int column, PieceType pieceType){
        boolean r1,r2,r3,r4;
        r1=r2=r3=r4=true;
        // Row check
         for(int j = 0; j < size; j++){
             if(board[row][j] == null || board[row][j].pieceType!=pieceType){
                 r1= false;
             }
         }

         //cols check
        for(int i = 0; i < size; i++){
            if(board[i][column] == null || board[i][column].pieceType != pieceType){
                r2 = false;
            }
        }

        //Diagonal check
        for(int i = 0 ;i < size ;i++){
            if(board[i][i] == null || board[i][i].pieceType != pieceType){
                r3 = false;
            }
        }

        for(int i = 0, j = size-1; i < size && j >= 0; i++,j--){
            if(board[i][j] == null || board[i][j].pieceType != pieceType){
                r4=false;
            }
        }
        return r1||r2||r2||r4;
    }

}
