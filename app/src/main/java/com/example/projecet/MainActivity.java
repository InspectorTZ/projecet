package com.example.projecet;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.ThreadLocalRandom;



    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
        public void onButtonClick(View view){
            Button b= (Button) view;

        }


    }

