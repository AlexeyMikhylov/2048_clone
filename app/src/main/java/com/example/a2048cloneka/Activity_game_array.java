package com.example.a2048cloneka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_game_array extends AppCompatActivity {

    //int[] myArray = new int[16];
    ImageView gametyle_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_array);

        gametyle_1 = (ImageView) findViewById(R.id.gametyle_1);
    }

    public void action(){
        ImageView.setOnTouchListener(new OnSwipeTouchListener(Activity_game_array.this) {
            @Override
            public void onSwipeTop() {
                Toast.makeText(Activity_game_array.this, "top", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onSwipeRight() {
                Toast.makeText(Activity_game_array.this, "right", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onSwipeLeft() {
                Toast.makeText(Activity_game_array.this, "left", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onSwipeBottom() {
                Toast.makeText(Activity_game_array.this, "bottom", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
