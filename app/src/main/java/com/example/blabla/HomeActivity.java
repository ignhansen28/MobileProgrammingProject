package com.example.blabla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    private static String JSON_URL = "https://api.themoviedb.org/3/movie/popular?api_key=396d4b3838c6a11a1b45b8d044de4824";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}