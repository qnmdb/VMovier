package com.qf.x.vmovier.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.qf.x.vmovier.R;
import com.qf.x.vmovier.common.API;
import com.qf.x.vmovier.view.adapter.BehindFragmenAdapter;
import com.qf.x.vmovier.view.fragment.BehindFragmen;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by X on 2017/1/10.
 */
public class BehindActivity extends AppCompatActivity {
    @BindView(R.id.behind_select)
    ImageView behindSelect;
    @BindView(R.id.behind_search)
    ImageView behindSearch;
    @BindView(R.id.behind_viewPager)
    ViewPager behindViewPager;
    @BindView(R.id.behind_tabLayout)
    TabLayout behindTabLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behind);
        ButterKnife.bind(this);
        ArrayList<Fragment> list = new ArrayList<>();
        BehindFragmen behindFragmen1 = BehindFragmen.newInstance(API.LL);
        BehindFragmen behindFragmen2 = BehindFragmen.newInstance(API.LL);
        BehindFragmen behindFragmen3 = BehindFragmen.newInstance(API.LL);
        BehindFragmen behindFragmen4 = BehindFragmen.newInstance(API.LL);
        BehindFragmen behindFragmen5 = BehindFragmen.newInstance(API.LL);
        BehindFragmen behindFragmen6 = BehindFragmen.newInstance(API.LL);
        BehindFragmen behindFragmen7 = BehindFragmen.newInstance(API.LL);
        BehindFragmen behindFragmen8 = BehindFragmen.newInstance(API.LL);
        list.add(behindFragmen1);
        list.add(behindFragmen2);
        list.add(behindFragmen3);
        list.add(behindFragmen4);
        list.add(behindFragmen5);
        list.add(behindFragmen6);
        list.add(behindFragmen7);
        list.add(behindFragmen8);
        BehindFragmenAdapter adapter = new BehindFragmenAdapter(getSupportFragmentManager(), list);
        behindViewPager.setAdapter(adapter);
        behindTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        behindTabLayout.setupWithViewPager(behindViewPager);

        behindSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        behindSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BehindActivity.this, LeftActivity.class);
                startActivity(intent);
            }
        });
    }
}
