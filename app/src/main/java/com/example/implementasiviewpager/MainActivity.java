package com.example.implementasiviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    WormDotsIndicator dots;
    AdapterViewPager adapterViewPager;
    LinearLayout background;

    int[] warna = {
            R.color.bg1,
            R.color.bg2,
            R.color.bg3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        dots = findViewById(R.id.dots);
        background = findViewById(R.id.background_utama);


        adapterViewPager = new AdapterViewPager(MainActivity.this);
        viewPager.setAdapter(adapterViewPager);
        dots.setViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                background.setBackgroundResource(warna[position]);


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}