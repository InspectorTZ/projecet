package com.example.projecet;
import android.app.DatePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;




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

            //צריך להוסיף:משתנים של צבעים וגם טיימר ואולי לעשות הכל בלולאה
            Button b= (Button) view;
            b.setBackgroundColor(android:backgroundTint="@android:color/black");
            //אם הוא לוחץ נכון
            if (b.getBackground()==black||timerCount==0){
                b.setBackgroundColor(white);
                score++;

            }
            //אם הוא לוחץ לא טוב
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

