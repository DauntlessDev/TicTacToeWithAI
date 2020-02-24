package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public ImageView[] board = new ImageView[9];
    TextView turnView;
    TextView headView;
    ImageView gridView;
    public Button playBtn;
    boolean playerOneTurn = true;
    boolean done = false;
    int counter = 0;

    public void tapListener(View view){
        counter++;
        String msg = "";
        ImageView imgView = (ImageView) view;
        if (playerOneTurn){
            playerOneTurn = false;
            turnView.setText("Player Two's Turn");
            imgView.setImageResource(R.drawable.circle);
            imgView.animate().alpha(1);
            imgView.setEnabled(false);
            imgView.setTag("O");
        }else{
            playerOneTurn = true;
            turnView.setText("Player One's Turn");
            imgView.setImageResource(R.drawable.eks);
            imgView.animate().alpha(1);
            imgView.setEnabled(false);
            imgView.setTag("X");
        }
        if (checkWinner() == "X"){
            msg = "Player 2 Won!";
            done = true;
        }else if (checkWinner() == "O"){
            msg ="Player 1 Won!";
            done = true;
        }else if (counter == 9){
            msg ="It's a draw";
            done = true;
        }
        if (done){
            turnView.setText(msg);
            playBtn.animate().alpha(1);
            playBtn.setEnabled(true);
            gridView.animate().alpha(.5f);
            turnView.animate().alpha(.5f);
            headView.animate().alpha(.5f);
            for (ImageView boardEach : board) {
                if (!boardEach.isEnabled()) {boardEach.animate().alpha(.5f);}
                boardEach.setEnabled(false);
            }
        }
    }

    public void reset(View view){
        view.animate().alpha(0);
        counter = 0;
        view.setEnabled(false);
        turnView.setText("Player One's Turn");
        gridView.animate().alpha(1);
        turnView.animate().alpha(1);
        headView.animate().alpha(1);
        for (ImageView boardEach : board) {
            boardEach.animate().alpha(0);
            boardEach.setEnabled(true);
            boardEach.setTag("N");
        }
        done = false;
        playerOneTurn = true;
    }
    public String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = "";
            switch (a) {
                case 0:
                    line = board[0].getTag().toString() + board[1].getTag().toString() + board[2].getTag().toString();
                    break;
                case 1:
                    line = board[3].getTag().toString() + board[4].getTag().toString() + board[5].getTag().toString();
                    break;
                case 2:
                    line = board[6].getTag().toString() + board[7].getTag().toString() + board[8].getTag().toString();
                    break;
                case 3:
                    line = board[0].getTag().toString() + board[3].getTag().toString() + board[6].getTag().toString();
                    break;
                case 4:
                    line = board[1].getTag().toString() + board[4].getTag().toString() + board[7].getTag().toString();
                    break;
                case 5:
                    line = board[2].getTag().toString() + board[5].getTag().toString() + board[8].getTag().toString();
                    break;
                case 6:
                    line = board[0].getTag().toString() + board[4].getTag().toString() + board[8].getTag().toString();
                    break;
                case 7:
                    line = board[2].getTag().toString() + board[4].getTag().toString() + board[6].getTag().toString();
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        return "N";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playBtn = findViewById(R.id.playBtn);
        board[0]= findViewById(R.id.imageView0);
        board[1] = findViewById(R.id.imageView1);
        board[2] = findViewById(R.id.imageView2);
        board[3] = findViewById(R.id.imageView3);
        board[4] = findViewById(R.id.imageView4);
        board[5] = findViewById(R.id.imageView5);
        board[6] = findViewById(R.id.imageView6);
        board[7] = findViewById(R.id.imageView7);
        board[8] = findViewById(R.id.imageView8);

        turnView = findViewById(R.id.turnText);
        headView = findViewById(R.id.headText);
        gridView = findViewById(R.id.gridImageView);

        playBtn.animate().alpha(0);
        playBtn.setEnabled(false);
        for (ImageView boardEach : board){
            boardEach.animate().alpha(0);
            boardEach.setTag("N");
        }
    }
}
