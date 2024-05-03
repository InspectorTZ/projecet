package com.example.projecet;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Random;




    public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

        Random r = new Random();
        int score=0;
        AlertDialog wrongClick;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
        public void onButtonClick(View view){


            Button b= (Button) view;
            b.setBackgroundColor(ContextCompat.getColor(this, R.color.black));
            //אם הוא לוחץ נכון
            if (b.getBackground()=="@color/black"){
                b.setBackgroundColor(white);
                score++;

            }
            //אם הוא לוחץ לא טוב
            else{
                WrongClick(score);
            }


        }
        public void WrongClick(int score){
                AlertDialog.Builder builder=new AlertDialog.Builder( this);
                builder.setTitle("YOU LOST!" );
                builder.setMessage("SCORE: "+ score);
                builder.setPositiveButton("PLAY AGAIN",this);
                builder.setPositiveButton("RATE THE APP",this);
                builder.setNeutralButton("Cancel",this);
                wrongClick = new builder.create();
                builder.show();


        }


        @Override
        public void onClick(DialogInterface dialog, int which) {

        }
    }

