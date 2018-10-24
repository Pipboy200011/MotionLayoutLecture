package com.mw2c.pipboy200011.motionlayoutlecture.viewpagerwithmotion;

import android.content.Context;
import android.support.constraint.motion.MotionLayout;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * @author Pavel Apanovskiy on 2018-10-24.
 */
public class ViewPagerHeader extends MotionLayout implements ViewPager.OnPageChangeListener {


    public ViewPagerHeader(Context context) {
        super(context);
    }

    public ViewPagerHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewPagerHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        int numPages = 3;
        setProgress((position + positionOffset) / (numPages - 1));
    }

    @Override
    public void onPageSelected(int position) {
        //
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //
    }
}
