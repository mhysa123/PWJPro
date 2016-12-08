package com.example.administrator.pwjproject.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;

import com.example.administrator.pwjproject.MainActivity;
import com.example.administrator.pwjproject.R;
import com.example.administrator.pwjproject.presenter.SplashPresenter;
import com.example.administrator.pwjproject.view.SplashviewIner;
import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SplashActivity extends Activity implements SplashviewIner{


    private SplashPresenter mUserLoginPresenter = new SplashPresenter(this, MainActivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        handleAnnimation();
/*
        String s = CharMatcher.DIGIT.retainFrom("some text 89983 and more");

        int[] numbers = { 1, 2, 3, 4, 5 };
*/

        String s = CharMatcher.DIGIT.retainFrom("some text 89983 and more");

       // String some = CharMatcher..retainFrom("some text 89983 and more");

        // Lists


        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return input.contains("Tom");
            }
        };

        Function<String, String> func = new Function<String,String>(){
            @Override
            public String apply(String input) {
                return input.replace("a","mhysa");
            }
        };

        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        Collection<String> result = FluentIterable.from(names)
               // .filter(predicate)
                .transform(func)
                .toList();



     /*   List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        boolean a = ImmutableList.of(names).contains("a");
        if(ImmutableList.of(names).contains("a")){

        }

        List<String> names1 = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        Collection<Boolean> result =
                Collections2.transform(names,
                        Functions.forPredicate(Predicates.containsPattern("m")));*/
       // Iterable<String> result = Iterables.filter(names, Predicates.containsPattern("a"));

      //  Toast.makeText(getApplicationContext(),some, Toast.LENGTH_SHORT).show();
      //  assertThat(result, containsInAnyOrder("Jane", "Adam"));

         Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
    }


    @Override
    public void handleAnnimation() {

        mUserLoginPresenter.splashAct();

    }
}
