package com.example.androidtrainingday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceivingMovieObjectActivity extends AppCompatActivity {
    TextView nameTV,genreTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving_movie_object);
        Intent intent = getIntent();
        Movie movie = intent.getParcelableExtra(Constants.MOVIE);
        String name = movie.getTitle();
        String genre = movie.getGenre();


        nameTV = findViewById(R.id.movieTitle);
        genreTV = findViewById(R.id.movieGenre);
        nameTV.setText(name);
        genreTV.setText(genre);

    }
    public void goBack(View view)
    {
        this.finish();
    }
}