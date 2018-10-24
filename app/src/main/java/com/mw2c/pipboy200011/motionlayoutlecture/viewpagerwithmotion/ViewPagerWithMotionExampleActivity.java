package com.mw2c.pipboy200011.motionlayoutlecture.viewpagerwithmotion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.motion.MotionLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.mw2c.pipboy200011.motionlayoutlecture.R;

public class ViewPagerWithMotionExampleActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, ViewPagerWithMotionExampleActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_with_motion_example_activity);

        setTitle("ViewPager With Motion Example");

        MotionLayout motionLayout = findViewById(R.id.motionLayout);
        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addViewPagerFragment("Page 1", R.layout.view_pager_with_motion_example_first_fragment);
        adapter.addViewPagerFragment("Page 2", R.layout.view_pager_with_motion_example_second_fragment);
        adapter.addViewPagerFragment("Page 3", R.layout.view_pager_with_motion_example_third_fragment);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        if (motionLayout!=null){
            viewPager.addOnPageChangeListener((ViewPager.OnPageChangeListener) motionLayout);
        }

    }
}
