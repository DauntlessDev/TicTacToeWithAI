package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TwoActivity extends AppCompatActivity {
    public ImageView[] board = new ImageView[9];
    TextView turnView;
    TextView headView;
    ImageView gridView;
    public Button playBtn;
    boolean done = false;
    int counter = 0;
    int rand ;

    Random random = new Random();

    public void tapListener(View view){
        counter++;
        String msg = "";
        ImageView imgView = (ImageView) view;
            turnView.setText("CPU vs Player");
            imgView.setImageResource(R.drawable.circle);
            imgView.animate().alpha(1);
            imgView.setEnabled(false);
            imgView.setTag("O");


        boolean AIturn = false;
        if(!checkWinner().equals("O")) {

//            done = true;
                for (int i = 0; i < 9; i++) {
                    if (board[i].isEnabled()) {
                        AIturn = true;
//                        msg ="It's a draw";
//                        done = false;
                    }
                }
            }

        if(AIturn){
            rand = random.nextInt(9);
            while(!board[rand].getTag().toString().equals("N") || !(board[rand].isEnabled())){
                rand = random.nextInt(9);}

            if(board[4].isEnabled()){
                rand = 4;
            } else if(board[0].getTag().equals("X") && board[1].getTag().equals("X") && board[2].isEnabled()){
                rand = 2;
            }else if(board[0].getTag().equals("X") && board[2].getTag().equals("X") && board[1].isEnabled()){
                rand = 1;
            }else if(board[2].getTag().equals("X") && board[1].getTag().equals("X") && board[0].isEnabled()){
                rand = 0;
            }else if(board[0].getTag().equals("X") && board[4].getTag().equals("X")&& board[8].isEnabled()){
                rand = 8;
            }else if(board[0].getTag().equals("X") && board[8].getTag().equals("X")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[0].getTag().equals("X") && board[3].getTag().equals("X")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[0].getTag().equals("X") && board[6].getTag().equals("X")&& board[3].isEnabled()){
                rand = 3;
            }else if(board[3].getTag().equals("X") && board[6].getTag().equals("X")&& board[0].isEnabled()){
                rand = 0;
            }else if(board[1].getTag().equals("X") && board[4].getTag().equals("X")&& board[7].isEnabled()){
                rand = 7;
            }else if(board[1].getTag().equals("X") && board[7].getTag().equals("X")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[4].getTag().equals("X") && board[7].getTag().equals("X")&& board[1].isEnabled()){
                rand = 1;
            }else if(board[2].getTag().equals("X") && board[5].getTag().equals("X")&& board[8].isEnabled()){
                rand = 8;
            }else if(board[2].getTag().equals("X") && board[8].getTag().equals("X")&& board[5].isEnabled()){
                rand = 5;
            }else if(board[2].getTag().equals("X") && board[4].getTag().equals("X")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[2].getTag().equals("X") && board[6].getTag().equals("X")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[6].getTag().equals("X") && board[4].getTag().equals("X")&& board[2].isEnabled()){
                rand = 2;
            }else if(board[2].getTag().equals("X") && board[4].getTag().equals("X")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[4].getTag().equals("X") && board[5].getTag().equals("X")&& board[3].isEnabled()){
                rand = 3;
            }else if(board[3].getTag().equals("X") && board[4].getTag().equals("X")&& board[5].isEnabled()){
                rand = 5;
            }else if(board[3].getTag().equals("X") && board[5].getTag().equals("X")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[6].getTag().equals("X") && board[7].getTag().equals("X")&& board[8].isEnabled()){
                rand = 8;
            }else if(board[6].getTag().equals("X") && board[8].getTag().equals("X")&& board[7].isEnabled()){
                rand = 7;
            }else if(board[7].getTag().equals("X") && board[8].getTag().equals("X")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[4].getTag().equals("X") && board[8].getTag().equals("X")&& board[0].isEnabled()){
                rand = 0;
            }else if(board[2].getTag().equals("X") && board[4].getTag().equals("X")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[6].getTag().equals("X") && board[4].getTag().equals("X")&& board[2].isEnabled()){
                rand = 2;
            }else if(board[6].getTag().equals("X") && board[2].getTag().equals("X")&& board[4].isEnabled()){
                rand = 4;
            }

            else if(board[0].getTag().equals("O") && board[1].getTag().equals("O") && board[2].isEnabled()){
                rand = 2;
            }else if(board[0].getTag().equals("O") && board[2].getTag().equals("O") && board[1].isEnabled()){
                rand = 1;
            }else if(board[2].getTag().equals("O") && board[1].getTag().equals("O") && board[0].isEnabled()){
                rand = 0;
            }else if(board[0].getTag().equals("O") && board[4].getTag().equals("O")&& board[8].isEnabled()){
                rand = 8;
            }else if(board[0].getTag().equals("O") && board[8].getTag().equals("O")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[0].getTag().equals("O") && board[3].getTag().equals("O")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[0].getTag().equals("O") && board[6].getTag().equals("O")&& board[3].isEnabled()){
                rand = 3;
            }else if(board[3].getTag().equals("O") && board[6].getTag().equals("O")&& board[0].isEnabled()){
                rand = 0;
            }else if(board[1].getTag().equals("O") && board[4].getTag().equals("O")&& board[7].isEnabled()){
                rand = 7;
            }else if(board[1].getTag().equals("O") && board[7].getTag().equals("O")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[4].getTag().equals("O") && board[7].getTag().equals("O")&& board[1].isEnabled()){
                rand = 1;
            }else if(board[2].getTag().equals("O") && board[5].getTag().equals("O")&& board[8].isEnabled()){
                rand = 8;
            }else if(board[2].getTag().equals("O") && board[8].getTag().equals("O")&& board[5].isEnabled()){
                rand = 5;
            }else if(board[2].getTag().equals("O") && board[4].getTag().equals("O")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[2].getTag().equals("O") && board[6].getTag().equals("O")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[6].getTag().equals("O") && board[4].getTag().equals("O")&& board[2].isEnabled()){
                rand = 2;
            }else if(board[2].getTag().equals("O") && board[4].getTag().equals("O")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[4].getTag().equals("O") && board[5].getTag().equals("O")&& board[3].isEnabled()){
                rand = 3;
            }else if(board[3].getTag().equals("O") && board[4].getTag().equals("O")&& board[5].isEnabled()){
                rand = 5;
            }else if(board[3].getTag().equals("O") && board[5].getTag().equals("O")&& board[4].isEnabled()){
                rand = 4;
            }else if(board[6].getTag().equals("O") && board[7].getTag().equals("O")&& board[8].isEnabled()){
                rand = 8;
            }else if(board[6].getTag().equals("O") && board[8].getTag().equals("O")&& board[7].isEnabled()){
                rand = 7;
            }else if(board[7].getTag().equals("O") && board[8].getTag().equals("O")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[4].getTag().equals("O") && board[8].getTag().equals("O")&& board[0].isEnabled()){
                rand = 0;
            }else if(board[2].getTag().equals("O") && board[4].getTag().equals("O")&& board[6].isEnabled()){
                rand = 6;
            }else if(board[6].getTag().equals("O") && board[4].getTag().equals("O")&& board[2].isEnabled()){
                rand = 2;
            }else if(board[6].getTag().equals("O") && board[2].getTag().equals("O")&& board[4].isEnabled()){
                rand = 4;
            }

            board[rand].setImageResource(R.drawable.eks);
            board[rand].animate().alpha(1).setDuration(1400);
            board[rand].setEnabled(false);
            board[rand].setTag("X");
        }



        if (checkWinner() == "X"){
            msg = "Computer Won!";
            done = true;
        }else if (checkWinner() == "O"){
            msg ="Player Won!";
            done = true;
        }else if (counter == 5){
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
        turnView.setText("CPU vs Player");
        gridView.animate().alpha(1);
        turnView.animate().alpha(1);
        headView.animate().alpha(1);
        for (ImageView boardEach : board) {
            boardEach.animate().alpha(0);
            boardEach.setEnabled(true);
            boardEach.setTag("N");
        }
        done = false;
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
        setContentView(R.layout.activity_two);
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
