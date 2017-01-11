package com.qf.x.vmovier.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.x.vmovier.R;
import com.qf.x.vmovier.common.IUiCallback;
import com.qf.x.vmovier.entity.Home_New;
import com.qf.x.vmovier.presenter.Home_NewPresenter;

/**
 * Created by X on 2017/1/10.
 */
public class NewFragment extends Fragment implements IUiCallback<Home_New> {
    private String cacherControl="/apiv3/post/getPostByTab";
    private int page=1;
    private int size=10;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.news,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }

    private void initData() {
        new Home_NewPresenter(this,page,size).loadData();
    }

    private void initView() {

    }

    @Override
    public void loadFinshData(Home_New data) {
        Log.d("===========================", "loadFinshData: "+data.toString());
    }
}
