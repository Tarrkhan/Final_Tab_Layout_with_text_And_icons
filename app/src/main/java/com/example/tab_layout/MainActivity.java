package com.example.tab_layout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new One_Fragment(),"ITEM ONE" );
        adapter.addFragment(new Two_fragment(),"ITEM TWO" );
        adapter.addFragment(new Three_Fragment(),"ITEM THREE" );

        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tablayout_id);
        tabLayout.setupWithViewPager(viewPager);
    }
}
