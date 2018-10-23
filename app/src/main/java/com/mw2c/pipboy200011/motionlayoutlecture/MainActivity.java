package com.mw2c.pipboy200011.motionlayoutlecture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        Button buttonMotionsSceneFirst = findViewById(R.id.button_motion_scene_first);
        Button buttonMotionsSceneSecond = findViewById(R.id.button_motion_scene_second);

        buttonMotionsSceneFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MotionSceneExampleFirstActivity.newIntent(MainActivity.this));
            }
        });
        buttonMotionsSceneSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MotionSceneExampleSecondActivity.newIntent(MainActivity.this));
            }
        });
    }
}
