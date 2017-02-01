package com.example.manasaa.activity_task;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TomorrowActivity extends AppCompatActivity {
    EditText editTxtTomorrow;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomorrow);
        editTxtTomorrow=(EditText) findViewById(R.id.editTextBox);
        String inputToday= editTxtTomorrow.getText().toString();
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String inputToday= editTxtTomorrow.getText().toString();
                Intent returnIntent = new Intent();
                returnIntent.putExtra("tasks",inputToday);
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        });

    }
}
