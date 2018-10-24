package com.mw2c.pipboy200011.motionlayoutlecture.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mw2c.pipboy200011.motionlayoutlecture.R;
import com.mw2c.pipboy200011.motionlayoutlecture.collapsingwithmotion.CollapsingWithMotionExampleActivity;
import com.mw2c.pipboy200011.motionlayoutlecture.customattribute.CustomAttributeExampleFirstActivity;
import com.mw2c.pipboy200011.motionlayoutlecture.customattribute.CustomAttributeExampleSecondActivity;
import com.mw2c.pipboy200011.motionlayoutlecture.keyframes.KeyFramesExampleActivity;
import com.mw2c.pipboy200011.motionlayoutlecture.motionscene.MotionSceneExampleFirstActivity;
import com.mw2c.pipboy200011.motionlayoutlecture.motionscene.MotionSceneExampleSecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        initViews();
    }

    private void initViews() {
        Button buttonMotionsSceneFirst = findViewById(R.id.button_motion_scene_first);
        Button buttonMotionsSceneSecond = findViewById(R.id.button_motion_scene_second);
        Button buttonCustomAttributeFirst = findViewById(R.id.button_custom_attribute_first);
        Button buttonCustomAttributeSecond = findViewById(R.id.button_custom_attribute_second);
        Button buttonKeyFrames = findViewById(R.id.button_key_frames);
        Button buttonCollapsingWithMotion = findViewById(R.id.button_collapsing_with_motion);

        final MainActivity activity = MainActivity.this;
        buttonMotionsSceneFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MotionSceneExampleFirstActivity.newIntent(activity));
            }
        });
        buttonMotionsSceneSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MotionSceneExampleSecondActivity.newIntent(activity));
            }
        });
        buttonCustomAttributeFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(CustomAttributeExampleFirstActivity.newIntent(activity));
            }
        });
        buttonCustomAttributeSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(CustomAttributeExampleSecondActivity.newIntent(activity));
            }
        });
        buttonKeyFrames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(KeyFramesExampleActivity.newIntent(activity));
            }
        });
        buttonCollapsingWithMotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(CollapsingWithMotionExampleActivity.newIntent(activity));
            }
        });
    }
}
