package com.example.myapplication44;

public class Victory {
    private int[] row = new int[11];
    private int[] col = new int[11];

    public void setRow(int row , int i) {
        this.row[row] = i;
    }

    public void setCol(int col ,int i) {
        this.col[col] = i;
    }

    public int[] getRow() {
        return row;
    }

    public int[] getCol() {
        return col;
    }

    public Victory() {
        for (int i = 0; i < 11; i++) {
            this.col[i] = 0;
            this.row[i] = 0;
        }
    }

    public int isVictory() {
        for (int i = 0; i < 9; i++) {
            if ((this.row[i] * this.row[i + 1] * this.row[i + 2]) == 1) {
                return 1;
            }
            if ((this.col[i] * this.col[i + 1] * this.col[i + 2]) == 1) {
                return 1;
            }
            if(this.row[0] * this.row[5] * this.row[10] == 1){
                return  1;
            }
            if(this.row[0] * this.row[5] * this.row[10] == 8){
                return  2;
            }
            if(this.col[2] * this.col[5] * this.col[8] == 1){
                return  1;
            }
            if(this.col[2] * this.col[5] * this.col[8] == 8){
                return  2;
            }
            if ((this.row[i] * this.row[i + 1] * this.row[i + 2]) == 8) {
                return 2;
            }
            if ((this.col[i] * this.col[i + 1] * this.col[i + 2]) == 8) {
                return 2;
            }
        }
        return 0;
    }

}
