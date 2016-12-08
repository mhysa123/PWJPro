package com.example.administrator.pwjproject.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.pwjproject.R;
import com.example.administrator.pwjproject.view.GuideViewInter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 引导页
 */
public class GuideActivity extends Activity implements View.OnClickListener,GuideViewInter{

    @Bind(R.id.guide_viewpage)
    ViewPager guideViewpage;
    @Bind(R.id.ll_contain)
    LinearLayout llContain;
    @Bind(R.id.guide_image)
    TextView guideImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initListener();
    }

  /*  @Override
    protected void initLayout(int layoutId) {
        super.initLayout(layoutId);
    }*/

    protected void initListener() {
      //  super.initListener();
        guideImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void guide() {

    }

    @Override
    public void MainActiviyJump() {

    }
}
