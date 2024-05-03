package com.example.projecet;
import android.app.DatePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.widget.TextView;




    public class MainActivity extends AppCompatActivity {
        Random r = new Random();
        int score=0;
        AlertDialog wrongClick;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
        public Void onButtonClick(View view){


            Button b= (Button) view;
            b.setBackgroundColor(android:backgroundTint="@android:color/black");
            if (b.getBackground()==black){
                b.setBackgroundColor(white);
                score++;

            }
            else{
                WrongClick(score);
                if(b== dialog.BUTTON_POSITIVE||b==dialog.BUTTON_NEUTRAL){
                    return onButtonClick(view);
                }
            }


        }
        public void WrongClick(int score){
                AlertDialog.Builder builder=new AlertDialog.Builder( this);
                builder.setTitle("YOU LOST!" );
                builder.setMessage("SCORE: "+ score);
                builder.setPositiveButton("PLAY AGAIN",this);
                builder.setPositiveButton("RATE THE APP",this);
                builder.setNeutralButton("Cancel",this);
                dialog = new builder.create();
                builder.show();


        }




    }

