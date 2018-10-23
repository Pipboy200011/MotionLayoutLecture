package com.mw2c.pipboy200011.motionlayoutlecture;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MotionSceneExampleSecondActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, MotionSceneExampleSecondActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_scene_example_second_activity);

        setTitle("Motion Scene Example Second");
    }
}
