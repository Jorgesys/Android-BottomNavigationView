package com.jorgesys.bottomnavigationview;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorit:
                                ((TextView)findViewById(R.id.myTextView)).setText(getString(R.string.txt_favorit)+ " selected!");
                                return true;
                            case R.id.action_time:
                                ((TextView)findViewById(R.id.myTextView)).setText(getString(R.string.txt_time)+ " selected!");
                                return true;
                            case R.id.action_muzic:
                                ((TextView)findViewById(R.id.myTextView)).setText(getString(R.string.txt_muzic)+ " selected!");
                                return true;

                        }
                        return true;
                    }
                });

    }
}
