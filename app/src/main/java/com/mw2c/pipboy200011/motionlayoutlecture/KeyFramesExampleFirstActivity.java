package com.mw2c.pipboy200011.motionlayoutlecture;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class KeyFramesExampleFirstActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, KeyFramesExampleFirstActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.key_frames_example_first_activity);

        setTitle("Keyframes Example First");
    }
}
