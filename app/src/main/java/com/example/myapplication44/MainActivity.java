package com.example.myapplication44;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
    public Button[] buttons;
    public Victory victory = new Victory();
    public int WhoPressed = 1;
    public int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Buttons();


    }


    public void Buttons() {
        buttons = new Button[9];
        buttons[0] = findViewById(R.id.b1);
        buttons[1] = findViewById(R.id.b2);
        buttons[2] = findViewById(R.id.b3);
        buttons[3] = findViewById(R.id.b4);
        buttons[4] = findViewById(R.id.b5);
        buttons[5] = findViewById(R.id.b6);
        buttons[6] = findViewById(R.id.b7);
        buttons[7] = findViewById(R.id.b8);
        buttons[8] = findViewById(R.id.b9);
        isPressed();

    }

    public void isPressed() {
        Thread t = new Thread(() -> {
            onClick();
            while (true) {
                if (counter >= 5) {
                    int isVictory = IsVictory();
                    System.out.println(Arrays.toString(victory.getRow()));
                    System.out.println(Arrays.toString(victory.getCol()));
                    if (isVictory == 1 || isVictory == 2 || isVictory == -1) {
                        for (int i = 0; i <= 8; i++) {
                            buttons[i].setClickable(false);
                        }
                        break;
                    }
                }
            }
        });
        t.start();
    }


    public void onClick() {
        buttons[0].setOnClickListener((view) -> {
            isChang(0);
            victory.setRow(0, WhoPressed);
            victory.setCol(0, WhoPressed);
            buttons[0].setClickable(false);
            counter++;
        });
        buttons[1].setOnClickListener((view) -> {
            isChang(1);
            victory.setRow(1, WhoPressed );
            victory.setCol(4, WhoPressed);
            buttons[1].setClickable(false);
            counter++;
        });
        buttons[2].setOnClickListener((view) -> {
            isChang(2);
            victory.setRow(2, WhoPressed);
            victory.setCol(8, WhoPressed);
            buttons[2].setClickable(false);
            counter++;
        });
        buttons[3].setOnClickListener((view) -> {
            isChang(3);
            victory.setRow(4, WhoPressed);
            victory.setCol(1, WhoPressed);
            buttons[3].setClickable(false);
            counter++;
        });
        buttons[4].setOnClickListener((view) -> {
            isChang(4);
            victory.setRow(5, WhoPressed);
            victory.setCol(5, WhoPressed);
            buttons[4].setClickable(false);
            counter++;
        });
        buttons[5].setOnClickListener((view) -> {
            isChang(5);
            victory.setRow(6, WhoPressed);
            victory.setCol(9, WhoPressed);
            buttons[5].setClickable(false);
            counter++;
        });
        buttons[6].setOnClickListener((view) -> {
            isChang(6);
            victory.setRow(8, WhoPressed);
            victory.setCol(2, WhoPressed);
            buttons[6].setClickable(false);
            counter++;
        });
        buttons[7].setOnClickListener((view) -> {
            isChang(7);
            victory.setRow(9, WhoPressed);
            victory.setCol(6, WhoPressed);
            buttons[7].setClickable(false);
            counter++;
        });
        buttons[8].setOnClickListener((view) -> {
            isChang(8);
            victory.setRow(10, WhoPressed);
            victory.setCol(10, WhoPressed);
            buttons[8].setClickable(false);
            counter++;
        });
    }


    public void isChang(int i) {
        if (WhoPressed == 1) {
            buttons[i].setText("X");
            buttons[i].setFontFeatureSettings("Arial");
            buttons[i].setTextSize(40);
            buttons[i].setBackgroundColor(Color.GREEN);
            WhoPressed = 2;
        } else if (WhoPressed == 2) {
            buttons[i].setText("O");
            buttons[i].setFontFeatureSettings("Arial");
            buttons[i].setTextSize(40);
            buttons[i].setBackgroundColor(Color.DKGRAY);
            WhoPressed = 1;
        }
    }


    public int IsVictory() {
        TextView text = findViewById(R.id.textWin);
        if (victory.isVictory() == 1) {
            text.setText("Is win 2: ");
            text.setFontFeatureSettings("Arial");
            text.setTextSize(40);
            text.setBackgroundColor(Color.GRAY);
            return 1;
        } else if (victory.isVictory() == 2) {
            text.setText("Is win 1: ");
            text.setFontFeatureSettings("Arial");
            text.setTextSize(40);
            text.setBackgroundColor(Color.GREEN);
            return 2;
        }
        if (counter == 9) {
            text.setText("Nobody own !! !");
            text.setFontFeatureSettings("Arial");
            text.setTextSize(40);
            text.setBackgroundColor(Color.YELLOW);
            return -1;
        }
        return 0;
    }

}