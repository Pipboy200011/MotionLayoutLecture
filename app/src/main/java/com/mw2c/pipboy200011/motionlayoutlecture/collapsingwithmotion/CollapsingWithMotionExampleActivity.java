package com.mw2c.pipboy200011.motionlayoutlecture.collapsingwithmotion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mw2c.pipboy200011.motionlayoutlecture.R;

public class CollapsingWithMotionExampleActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, CollapsingWithMotionExampleActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsing_with_motion_example_activity);

        getWindow().setStatusBarColor(getColor(R.color.colorPrimaryDark));
    }
}
