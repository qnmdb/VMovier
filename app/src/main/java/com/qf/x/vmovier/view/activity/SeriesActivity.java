package com.qf.x.vmovier.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.qf.x.vmovier.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by X on 2017/1/10.
 */
public class SeriesActivity extends AppCompatActivity {
    @BindView(R.id.series_select)
    ImageView seriesSelect;
    @BindView(R.id.series_search)
    ImageView seriesSearch;
    @BindView(R.id.series_recyclerView)
    RecyclerView seriesRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.series);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.series_select, R.id.series_search})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.series_select:
                Intent intent = new Intent(SeriesActivity.this, LeftActivity.class);
                startActivity(intent);
                break;
            case R.id.series_search:
                break;
        }
    }
}
