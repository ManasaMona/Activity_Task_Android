package com.example.manasaa.activity_task;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TodayActivity extends AppCompatActivity {
    EditText today_editTxt;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        today_editTxt=(EditText) findViewById(R.id.editTextToday);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String inputToday= today_editTxt.getText().toString();
                Intent returnIntent = new Intent();
                returnIntent.putExtra("tasks",inputToday);
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        });
    }
}
