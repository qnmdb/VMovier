package com.qf.x.vmovier.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.qf.x.vmovier.R;
import com.qf.x.vmovier.view.adapter.HomeAdapter;
import com.qf.x.vmovier.view.fragment.ChannelFragment;
import com.qf.x.vmovier.view.fragment.NewFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.home_select)
    ImageView homeSelect;
    @BindView(R.id.home_search)
    ImageView homeSearch;
    @BindView(R.id.home_vp)
    ViewPager homeVp;
    @BindView(R.id.home_tabLayout)
    TabLayout homeTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayList<Fragment> list = new ArrayList<>();
        NewFragment newFragment = new NewFragment();
        ChannelFragment channelFragment = new ChannelFragment();
        list.add(newFragment);
        list.add(channelFragment);
        HomeAdapter adapter = new HomeAdapter(getSupportFragmentManager(), list);
        homeVp.setAdapter(adapter);
        homeTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        homeTabLayout.setupWithViewPager(homeVp);
        homeSelect.setOnClickListener(this);
        homeSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_select:
                Intent intent = new Intent(this, LeftActivity.class);
                startActivity(intent);
                break;
            case R.id.home_search:

                break;
        }
    }
}
