package com.example.projecet;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;




    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
        public void onButtonClick(View view){
            Button b= (Button) view;
            Drawable backgroundDrawable = b.getBackground();

            if (backgroundDrawable instanceof ColorDrawable)
            {
                int color = ((ColorDrawable) backgroundDrawable).getColor();
                int scor=0;
                int red = android.graphics.Color.red(color);
                int green = android.graphics.Color.green(color);
                int blue = android.graphics.Color.blue(color);
                scor=scor+1;
                if (red == 0 && green == 0 && blue == 0) {
                    System.out.println("SCORE:"+scor);
                } else {
                    System.out.println("YOU LOST");
                }
            } else {
                System.out.println("YOU LOST!");
            }


        }



    }

