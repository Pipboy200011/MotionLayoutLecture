package com.mw2c.pipboy200011.motionlayoutlecture.motionscene;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mw2c.pipboy200011.motionlayoutlecture.R;

public class MotionSceneExampleFirstActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, MotionSceneExampleFirstActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_scene_example_first_activity);

        setTitle("Motion Scene Example First");
    }
}
