package com.example.manasaa.activity_task;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button button_today;
    Button button_tomorrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_today=(Button) findViewById(R.id.today_button);
        button_tomorrow=(Button) findViewById(R.id.tomorrow_button);

        button_today.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launch_todayActivity= new Intent(MainActivity.this,TodayActivity.class);
                startActivityForResult(launch_todayActivity,1);
            }
        });

        button_tomorrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launch_tomorrowActivity= new Intent(MainActivity.this,TomorrowActivity.class);
                startActivityForResult(launch_tomorrowActivity,2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("tasks");
                result="TODAY TASKS: \n "+result;
                TextView textView = (TextView) findViewById(R.id.display_textView);
                textView.setText(result);
            }
        }
        if (requestCode == 2) {
            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("tasks");
                result="TOMORROW TASKS: \n "+result;
                TextView textView = (TextView) findViewById(R.id.display_textView);
                textView.setText(result);
            }
        }

    }
}
