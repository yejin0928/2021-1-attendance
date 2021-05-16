package com.example.attendance_test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_menu);

        Intent intent = getIntent();
        String email=intent.getStringExtra("user_code"); //데이터 받기

        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), SclassroomActivity.class);
                intent.putExtra("user_code", email);
                startActivity(intent);
            }
        });
    }
}