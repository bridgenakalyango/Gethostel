package com.example.gethostel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Name: Nakalyango Bridget
//        Regno: 2017/bit/158
//        Course: BIT
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "App started", Toast.LENGTH_SHORT).show();
    }




    public void login(View view) {
        Intent intent = new Intent(this,homepage.class);
        startActivity(intent);
    }
}
