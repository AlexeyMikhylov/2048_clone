package com.example.a2048cloneka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class GameActivity extends AppCompatActivity {

    ToggleButton darkthemeToggle;
    TextView textView1;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        textView1 = (TextView) findViewById(R.id.textView1);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.ordinary);

        LinearLayout window = (LinearLayout) findViewById(R.id.main_activity);

        darkthemeToggle = (ToggleButton) findViewById(R.id.darkthemeToggle);
    }
}
