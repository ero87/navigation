package com.example.student.navigationexamples;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.content, new OneFragment()).commit();

        BottomNavigationView menu = (BottomNavigationView) findViewById(R.id.navigation);
        menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.navigation_dashboard:{
                        manager.beginTransaction().replace(R.id.content, new OneFragment()).commit();
                        return true;
                    }
                    case R.id.navigation_home:{
                        manager.beginTransaction().replace(R.id.content, new TwoFragment()).commit();
                        return true;
                    }
                    case R.id.navigation_notifications:{
                        manager.beginTransaction().replace(R.id.content, new ThreeFragment()).commit();
                        return true;
                    }
                    case R.id.navigation_voice: {
                        manager.beginTransaction().replace(R.id.content, new ForFragment()).commit();
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
