package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);


        Log.i((tag ) "Lifecycle", (msg) "OnCreate() invoked");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i( tag: "Lifecycle", msg: "OnStart() invoked");

    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.i( tag: "Lifecycle", msg: "OnResume() invoked");
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.i( tag: "Lifecycle", msg: "onPause() invoked");
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.i( tag: "Lifecycle", msg: "onStop() invoked");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.i( tag: "Lifecycle", msg: "onDestroy() invoked");
    }
}