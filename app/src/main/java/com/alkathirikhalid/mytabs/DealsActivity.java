package com.alkathirikhalid.mytabs;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class DealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the two primary sections of the activity.
        DealsFragmentStatePagerAdaptor dealsFragmentStatePagerAdaptor = new DealsFragmentStatePagerAdaptor(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        ViewPager viewPager = findViewById(R.id.container);
        viewPager.setAdapter(dealsFragmentStatePagerAdaptor);

        TabLayout tabLayout = findViewById(R.id.tabs);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

    }
}
