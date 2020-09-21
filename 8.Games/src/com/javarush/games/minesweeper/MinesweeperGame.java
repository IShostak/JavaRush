package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
     private  int countMinesOnField  = 0;

    private  GameObject[][] gameField = new GameObject[SIDE][SIDE];


    private final static int SIDE =9;

    private void createGame(){
        for (int i =0; i < gameField.length; i++){
            for (int j = 0; j < gameField[i].length; j++) {
                int n = getRandomNumber(10);

                boolean b;
                if(n > 0 && n <=1){
                    b = true;
                    countMinesOnField++;
                }
                else b = false;


                gameField[i][j] = new GameObject(j,i,b);


                setCellColor(i,j, Color.ORANGE);
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
    }
}
