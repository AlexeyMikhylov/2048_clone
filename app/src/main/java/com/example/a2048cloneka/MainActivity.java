package com.example.a2048cloneka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private int buttonState = 0;

    public static boolean DarkThemeCheck;

    Button btnActTwo;
    Button btnContinue;
    ToggleButton darkthemeToggle;
    TextView nameTextView;
    TextView darkthemeTextView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        darkthemeToggle = (ToggleButton) findViewById(R.id.darkthemeToggle);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        darkthemeTextView = (TextView) findViewById(R.id.darkthemeTextView);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        btnContinue = (Button) findViewById(R.id.btnContinue);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.ordinary);

        final Button button = findViewById(R.id.darkthemeToggle);

        //Add OnClickEvents to the button that responds to the user event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout window = (LinearLayout) findViewById(R.id.main_activity);

                if(buttonState % 2 == 0){
                    button.setBackgroundColor(getResources().getColor(R.color.white));
                    nameTextView.setTextColor(getResources().getColor(R.color.white));
                    view.setBackgroundResource(R.color.black);
                    darkthemeTextView.setTextColor(getResources().getColor(R.color.white));
                    btnActTwo.setBackgroundResource(R.color.white);
                    btnContinue.setBackgroundResource(R.color.logocolor);
                    window.setBackgroundResource(R.color.black);
                    button.setText("ON");
                    DarkThemeCheck = true;

                    /*Globals g = Globals.getInstance();
                    g.setDarkTheme(1);*/
                }
                else{
                    button.setBackgroundColor(getResources().getColor(R.color.logocolor));
                    nameTextView.setTextColor(getResources().getColor(R.color.logocolor));
                    darkthemeTextView.setTextColor(getResources().getColor(R.color.black));
                    view.setBackgroundResource(R.color.ordinary);
                    btnActTwo.setBackgroundResource(R.color.logocolor);
                    btnContinue.setBackgroundResource(R.color.white);
                    window.setBackgroundResource(R.color.ordinary);
                    button.setText("OFF");
                    DarkThemeCheck = false;

                    /*Globals g = Globals.getInstance();
                    g.setDarkTheme(0);*/
                }
                buttonState++;
            }
        });
    }

    //переход на вторую активити
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, GameActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
