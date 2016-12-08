package com.example.administrator.pwjproject.model;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by mhysa on 2016/12/6.
 * 引导页
 */
public interface GuideInter
{

    //加载数据
    void Initdata(View view, Context context, ViewPager mViewPage);
    //加载小圆点
    void InitDots(View view, Context context, ViewPager mViewPage);
}
