package com.example.myapplication44;

public class Victory {
    private  int[] row = new int[11];
    private  int[] col = new int[11];

    public void setRow(int[] row) {
        this.row = row;
    }

    public void setCol(int[] col) {
        this.col = col;
    }

    public int[] getRow() {
        return row;
    }

    public int[] getCol() {
        return col;
    }

    public Victory() {
        for (int i = 0; i <= 12; i++) {
            this.col[i] = 0;
            this.row[i] = 0;
        }
    }
    public int isVictory(){
        for (int i = 0; i < 10; i++) {
            if ((this.row[i] * this.row[i+1] * this.row[i+2]) == 1) {
                return 1;
            }
        }
return 0;
    }

}
