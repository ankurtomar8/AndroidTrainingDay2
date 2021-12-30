package com.example.androidtrainingday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText field1;
     EditText field2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        field1 = findViewById(R.id.fiedl1);
        field2 = findViewById(R.id.field2);
    }

    public void moveToSecond(View view)
    {
        Intent  moveToSecond = new Intent(MainActivity.this,SecondReceivingActivity.class);
        moveToSecond.putExtra(Constants.NAME,"Ankur");
        startActivity(moveToSecond);
    }

// sending movie object to different screen intent
    public void sendMovie(View view)
    {
        Movie movie = new Movie(field1.getText().toString(),field2.getText().toString());
        Intent intent = new Intent(MainActivity.this,ReceivingMovieObjectActivity.class);
        intent.putExtra(Constants.MOVIE, (Parcelable) movie);
        startActivity(intent);


    }
}