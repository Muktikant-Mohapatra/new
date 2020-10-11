package com.example.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle","onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle","onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle","onStop");
    }
}