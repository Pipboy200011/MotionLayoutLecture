package com.mw2c.pipboy200011.motionlayoutlecture;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CustomAttributeExampleSecondActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, CustomAttributeExampleSecondActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_attribute_example_second_activity);

        setTitle("Custom Attribute Example Second");
    }
}
