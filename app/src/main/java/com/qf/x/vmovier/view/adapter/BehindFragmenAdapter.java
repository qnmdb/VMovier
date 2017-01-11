package com.qf.x.vmovier.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by X on 2017/1/10.
 */
public class BehindFragmenAdapter extends FragmentPagerAdapter{
    private ArrayList<Fragment> list;
    private String[] title={"全部","电影自习室","电影会客厅","拍摄","器材","VR","后期","综述"};
    public BehindFragmenAdapter(FragmentManager fm,ArrayList<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
