package com.example.zomato;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
//
//    private static RecyclerView.Adapter adapter;
//    private RecyclerView.LayoutManager layoutManager;
//    private static RecyclerView recyclerView;
//    private static ArrayList<Restaurants> zomatoList ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment3,new Order()).commit();
    }

    BottomNavigationView.OnNavigationItemSelectedListener listener =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()){
                case R.id.order:
                    selectedFragment= new Order();
                    break;
                case R.id.history:
                    selectedFragment = new History();
                    break;
                case R.id.profile:
                    selectedFragment = new Profile();
                    break;
                case R.id.videos:
                    selectedFragment = new Videos();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment3,selectedFragment).commit();
            return true ;
        }
    };
}