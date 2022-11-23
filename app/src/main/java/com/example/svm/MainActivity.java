package com.example.svm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    game gameFragment = new game();
    scoreboard scoreboardFragment = new scoreboard();
    punishment punishmentFragment = new punishment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener( item -> {
            switch (item.getItemId()) {
                case R.id.game:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, gameFragment).commit();
                    return true;

                case R.id.score:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, scoreboardFragment).commit();
                    return true;

                case R.id.pun:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, punishmentFragment).commit();
                    return true;
            }
            return false;
        } );
        bottomNavigationView.setSelectedItemId(R.id.game);
    }


}