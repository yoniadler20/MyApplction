package com.example.myapplication44;

public class Player {
    private int x;
    private int y;
    private int isTurn;

    public int getIsTurn() {
        return isTurn;
    }

    public void setIsTurn(int isTurn) {
        this.isTurn = isTurn;
    }

    public Player() {
        this.x = 1;
        this.y = 2;
        this.isTurn = 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int WhoTurn(){
        if(this.isTurn % 2 == 1){
            this.isTurn +=1;
           return 1;
        }
       else{
            this.isTurn +=1;
            return 2;
        }
    }

}
