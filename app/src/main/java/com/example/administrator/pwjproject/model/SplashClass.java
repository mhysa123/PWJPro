package com.example.administrator.pwjproject.model;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.pwjproject.R;

/**
 * Created by mhysa on 2016/11/30.
 */
public class SplashClass implements SplashInter {
    @Override
    public void welcome(final Context context, final Class class1) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                context.startActivity(new Intent(context, class1));
            }
        }, 2000);

    }
}
