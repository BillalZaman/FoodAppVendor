package com.infotech4it.cibovendor.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.infotech4it.cibovendor.R;
import com.infotech4it.cibovendor.databinding.ActivityMainBinding;
import com.infotech4it.cibovendor.fragments.FragmentNavigationDrawer;
import com.infotech4it.cibovendor.helpers.UIHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FragmentNavigationDrawer.FragmentDrawerListener{
    private ActivityMainBinding binding;
    private FragmentNavigationDrawer fragmentNavigationDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        init();
    }

    private void init() {
        binding.setOnClick(this);
        fragmentNavigationDrawer = (FragmentNavigationDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        fragmentNavigationDrawer.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout));
        fragmentNavigationDrawer.setDrawerListener(this);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.imgMenu:{
                binding.drawerLayout.openDrawer(GravityCompat.START);
                break;
            }
        }
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        switch (position) {
            case 0: {
                // Order Tracking
                break;
            }
            case 1: {
                // Menu
                UIHelper.openActivity(MainActivity.this, AddMenuActivity.class);
                binding.drawerLayout.closeDrawer(GravityCompat.START);
                break;
            }
            case 2: {
                // Change Password
                UIHelper.openActivity(MainActivity.this, ChangePasswordActivity.class);
                binding.drawerLayout.closeDrawer(GravityCompat.START);
                break;
            }
            case 3: {

                binding.drawerLayout.closeDrawer(GravityCompat.START);
                break;
            }
            default: {
                break;
            }
        }
    }
}