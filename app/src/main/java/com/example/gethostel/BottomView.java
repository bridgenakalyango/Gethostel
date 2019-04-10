package com.example.gethostel;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BottomView extends AppCompatActivity {
    Button tp,bc,gf,mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_view);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();

        tp = findViewById(R.id.tp);
//        tp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent tp = new Intent(getApplicationContext(),Triple.class);
//                startActivity(tp);
//                Toast.makeText(getApplicationContext(), "Triple", Toast.LENGTH_SHORT).show();
//            }
//        });
        bc = findViewById(R.id.bc);
//        bc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent bc = new Intent(getApplicationContext(),Beco.class);
//                startActivity(bc);
//                Toast.makeText(getApplicationContext(), "Beco", Toast.LENGTH_SHORT).show();
//            }
//        });
        gf = findViewById(R.id.gf);
//        gf.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent gf = new Intent(getApplicationContext(),Golf.class);
//                startActivity(gf);
//                Toast.makeText(getApplicationContext(), "Golf", Toast.LENGTH_SHORT).show();
//            }
//        });
        mk = findViewById(R.id.mk);
//        mk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mk = new Intent(getApplicationContext(),Mark.class);
//                startActivity(mk);
//                Toast.makeText(getApplicationContext(), "Mark", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()){
                case R.id.hm:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.sh:
                    selectedFragment = new SearchFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,selectedFragment).commit();
            return true;
        }
    };
    public void Triple(View view) {
        Toast.makeText(this, "Triple", Toast.LENGTH_SHORT).show();
        Intent tp = new Intent(this,Triple.class);
        startActivity(tp);

    }
    public void Mark(View view) {
        Intent mk = new Intent(this,Mark.class);
        startActivity(mk);
    }
    public void Beco(View view){
        Intent bc = new Intent(this,Beco.class);
        startActivity(bc);
    }
    public void Golf(View view) {
        Intent gf = new Intent(this,Golf.class);
        startActivity(gf);
    }
}
