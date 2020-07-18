package com.app.tractiv.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.app.tractiv.R;
import com.app.tractiv.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {


    final Fragment profileFragment = new ProfileFragment();
    Fragment activeFragment = profileFragment;



    BottomNavigationView m_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        m_navigation = (BottomNavigationView) findViewById(R.id.navigation);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        /**
         * Load First Fragment
         */
        fragmentManager.beginTransaction().add(R.id.container,profileFragment,"HomeFragment").commit();

        /**
         * on selected bottomnavigation
         */
        m_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.action_home:

                        return true;

                    case R.id.action_activiti:

                        return true;

                    case R.id.action_discover:

                        return true;

                    case R.id.action_account:

                        fragmentManager.beginTransaction().hide(activeFragment).show(profileFragment).commit();
                        activeFragment = profileFragment;
                        return true;


                    default:
                        return false;
                }
            }
        });



    }




}
