package com.example.administrator.pwjproject.base;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * PagerAdapter的封装
 */
public abstract class BasePagerAdapter<T> extends PagerAdapter {
    private List<T> mList;

    public BasePagerAdapter(List<T> list) {
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    /**
     * 子类去重写实现此方法
     */
    public abstract Object instantiateItem(ViewGroup container, int position);
}
