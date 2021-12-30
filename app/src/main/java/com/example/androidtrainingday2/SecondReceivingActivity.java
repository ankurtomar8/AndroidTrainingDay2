package com.example.androidtrainingday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondReceivingActivity extends AppCompatActivity {
    TextView nameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_receiving);
        Intent intent = getIntent();
        String name = intent.getStringExtra(Constants.NAME);
        nameTV = findViewById(R.id.nameTV);
        nameTV.setText(name);
    }

    public void goBack(View view)
    {
        this.finish();
    }
}