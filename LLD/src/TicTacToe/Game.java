package TicTacToe;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Board gameBoard;
    private Deque<Player> playerDeque;

    int size ;
    public  Game(){
        size = 3;
        initializeGame();
    }

    private void initializeGame(){
        playerDeque = new LinkedList<>();
        playerDeque.add(new Player("Player1",new PlayingPieceX()));
        playerDeque.add(new Player("player2",new PlayingPieceO()));

        gameBoard = new Board(3);

    }

    public  String startGame(){
        boolean noWinner = true;
        while(noWinner){

            Player player = playerDeque.removeFirst();

            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeSpace = gameBoard.findFreeCell();

            if(freeSpace.isEmpty()){
                noWinner=false;
                continue;
            }

            Scanner sc  = new Scanner(System.in);
            System.out.println("Player : " + player.name+" Enter the row, column");
            int inputRow = sc.nextInt();
            int inputColumn = sc.nextInt();

            boolean pieceAddedSuccessFully = gameBoard.addPiece(inputRow,inputColumn, player.playingPiece);

            if(!pieceAddedSuccessFully){
                System.out.println("Incorrect position choosen, try again");
                playerDeque.addFirst(player);
                continue;
            }

            playerDeque.addLast(player);

            boolean winner = gameBoard.isThereWinner(inputRow, inputColumn, player.playingPiece.pieceType);
            if(winner){
                return "Winner is "+ player.name;
            }

        }
        return "Tie";
    }




}
