package SnakeAndLadder;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Board  {
    public  Cell [][] cells;
    public  Board(int boardSize,int numberofSnakes, int numberofLaders){
        initializeCells(boardSize);
        addSnakeLadders(cells,numberofSnakes,numberofLaders);
    }

    private void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i=0; i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                Cell cell = new Cell();
                cells[i][j]=cell;
            }
        }
    }

    private  void addSnakeLadders(Cell [][] cells,int numberofSnakes, int numberofLadders){
        while(numberofSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
             if(snakeTail >= snakeHead){
                 continue;
             }
            Jump snakeObj = new Jump();
             snakeObj.start = snakeHead;
             snakeObj.end = snakeTail;

             Cell cell = getCell(snakeHead);
             cell.jump = snakeObj;
            numberofSnakes--;
        }

        while (numberofLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int ladderend = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(ladderStart >= ladderend){
                continue;
            }
            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderend;

            Cell cell = getCell(ladderStart);
            cell.jump =ladderObj;

            numberofLadders--;
        }
    }

    public   Cell getCell(int index){
        return cells[index/cells.length][index%cells.length];
    }

}
