package com.example.administrator.pwjproject.presenter;


import android.content.Context;
import android.gesture.Prediction;
import android.os.Handler;

import com.example.administrator.pwjproject.model.SplashClass;
import com.example.administrator.pwjproject.model.SplashInter;
import com.example.administrator.pwjproject.view.SplashviewIner;
import com.google.common.base.Preconditions;

/**
 * Created by mhysa on 2016/12/1.
 */
public class SplashPresenter {


    private SplashClass splash;
    private Context context;
    private Class class1;
    public SplashPresenter(final Context context,Class class1){
        this.context = Preconditions.checkNotNull(context);
        this.class1 = Preconditions.checkNotNull(class1);
        splash = new SplashClass();
    }
    public void splashAct(){
        splash.welcome(context,class1);
    }

}
