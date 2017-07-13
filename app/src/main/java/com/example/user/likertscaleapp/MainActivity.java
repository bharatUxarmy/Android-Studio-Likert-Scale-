package com.example.user.likertscaleapp;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    String printText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.likert_scale);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.strong_disagree:
                        printText = "Strongly Disagree";
                        break;
                    case R.id.disagree:
                        printText = "Disagree";
                        break;
                    case R.id.neutral:
                        printText = "Neutral";
                        break;
                    case R.id.agree:
                        printText = "Agree";
                        break;
                    case R.id.strong_agree:
                        printText = "Strongly Agree";
                        break;
                }

                Toast.makeText(MainActivity.this, printText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
