package com.example.myapplication44;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button[] buttons;
    public Player player = new Player();
    public static int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Buttons();


    }


    public void Buttons() {
        buttons = new Button[9];
        buttons[0] = (Button) findViewById(R.id.b1);
        buttons[1] = (Button) findViewById(R.id.b2);
        buttons[2] = (Button) findViewById(R.id.b3);
        buttons[3] = (Button) findViewById(R.id.b4);
        buttons[4] = (Button) findViewById(R.id.b5);
        buttons[5] = (Button) findViewById(R.id.b6);
        buttons[6] = (Button) findViewById(R.id.b7);
        buttons[7] = (Button) findViewById(R.id.b8);
        buttons[8] = (Button) findViewById(R.id.b9);
        isPressed();

    }

    public void isPressed() {
        Thread t = new Thread(() -> {
            buttons[0].setOnClickListener((view) -> {
                isChang(0);
            });
            buttons[1].setOnClickListener((view) -> {
                isChang(1);
            });
            buttons[2].setOnClickListener((view) -> {
                isChang(2);
            });
            buttons[3].setOnClickListener((view) -> {
                isChang(3);
            });
            buttons[4].setOnClickListener((view) -> {
                isChang(4);
            });
            buttons[5].setOnClickListener((view) -> {
                isChang(5);
            });
            buttons[6].setOnClickListener((view) -> {
                isChang(6);
            });
            buttons[7].setOnClickListener((view) -> {
                isChang(7);
            });
            buttons[8].setOnClickListener((view) -> {
                isChang(8);
            });



        });
        t.start();
    }

    public void isChang(int i) {
        int isTurn = player.WhoTurn();
        if (isTurn == 1 && buttons[i].getText() ==  "") {
            buttons[i].setText("X");
            buttons[i].setBackgroundColor(Color.GREEN);
        }
       else if (isTurn == 2 && buttons[i].getText() ==  "") {
            buttons[i].setText("O");
            buttons[i].setBackgroundColor(Color.YELLOW);
        }
        else {
            player.setIsTurn(player.WhoTurn()+1);
        }

    }


}