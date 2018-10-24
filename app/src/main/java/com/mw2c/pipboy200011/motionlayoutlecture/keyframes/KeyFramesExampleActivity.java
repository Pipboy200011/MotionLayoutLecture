package com.mw2c.pipboy200011.motionlayoutlecture.keyframes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mw2c.pipboy200011.motionlayoutlecture.R;

public class KeyFramesExampleActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, KeyFramesExampleActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.key_frames_example_activity);

        setTitle("Keyframes Example");
    }
}
