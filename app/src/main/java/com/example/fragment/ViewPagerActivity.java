package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor());
        ViewPagerActivity viewPagerActivity =new ViewPagerActivity(getSupportFragmentManager());


    }
}
