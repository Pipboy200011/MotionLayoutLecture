package com.mw2c.pipboy200011.motionlayoutlecture.other;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.motion.MotionLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.mw2c.pipboy200011.motionlayoutlecture.R;

public class OtherMotionExampleActivity extends AppCompatActivity {

    private MotionLayout mContainer;

    public static Intent newIntent(Context context) {
        return new Intent(context, OtherMotionExampleActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_motion_example_activity);

        initViews();
    }

    private void initViews() {
        mContainer = findViewById(R.id.container);
        ImageView imageView = findViewById(R.id.motion_plus_view);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mContainer.getCurrentState() == R.id.end) {
                    mContainer.transitionToStart();
                } else {
                    mContainer.transitionToEnd();
                }
            }
        });
    }
}
