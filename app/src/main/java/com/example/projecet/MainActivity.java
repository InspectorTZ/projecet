package com.example.projecet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        setButtonColor(button11, R.color.black);
        setButtonColor(button12, R.color.black);

    }

    public void onAimButtonClick(View view) {
        Button clickedButton = (Button) view;
        int currentColor = (int) clickedButton.getTag();

        if (currentColor == R.color.black) {

            setButtonColor(clickedButton, R.color.white);
        } else {

            setButtonColor(clickedButton, R.color.black);
        }
    }

    private void setButtonColor(Button button, int colorResId) {
        int color = getResources().getColor(colorResId, getTheme());
        button.setBackgroundColor(color);
        button.setTag(colorResId);
    }
}
