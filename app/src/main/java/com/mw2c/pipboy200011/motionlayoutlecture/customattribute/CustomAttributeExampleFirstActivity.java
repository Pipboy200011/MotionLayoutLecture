package com.mw2c.pipboy200011.motionlayoutlecture.customattribute;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mw2c.pipboy200011.motionlayoutlecture.R;

public class CustomAttributeExampleFirstActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, CustomAttributeExampleFirstActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_attribute_example_first_activity);

        setTitle("Custom Attribute Example First");
    }
}
