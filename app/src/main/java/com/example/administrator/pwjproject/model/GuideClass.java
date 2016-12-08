package com.example.administrator.pwjproject.model;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.administrator.pwjproject.R;

import java.util.ArrayList;

/**
 * Created by mhysa on 2016/12/6.
 * 引导页实现类
 */
public class GuideClass implements GuideInter {

    LinearLayout mDots;
    private ArrayList<ImageView> mImageViewList;
    @Override
    public void Initdata(View view ,Context context, ViewPager mViewPage) {

        int[] imageIds = {R.mipmap.guide_1, R.mipmap.guide_2, R.mipmap.guide_3};
        mImageViewList = new ArrayList<>();
        ImageView imageView;
        for (int i = 0; i < imageIds.length; i++) {
            imageView = new ImageView(context);
            imageView.setBackgroundResource(imageIds[i]);
            mImageViewList.add(imageView);
        }
        //初始化小点
        InitDots(view,context,mViewPage);
        //给viewPage设置适配器
       // mViewPage.setAdapter(new GuideAdapter(mImageViewList));
    }
    //加载小圆点

    @Override
    public void InitDots(View view, Context context, ViewPager mViewPage) {

        mDots = (LinearLayout) view;
        mDots.removeAllViews();
        for (int i = 0; i < mImageViewList.size(); i++) {
            View dot = new View(context);
            LinearLayout.LayoutParams layoutParams =
                    new LinearLayout.LayoutParams(20, 20);
            layoutParams.setMargins(0, 0, 20, 0);
            dot.setLayoutParams(layoutParams);
            dot.setBackgroundResource(R.drawable.guide_dot_selector);
            if (i == mViewPage.getCurrentItem()) {
                dot.setEnabled(true);
            } else {
                dot.setEnabled(false);
            }
            mDots.addView(dot);
        }
    }
}
