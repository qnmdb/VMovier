package com.qf.x.vmovier.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.x.vmovier.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by X on 2017/1/10.
 */
public class BehindFragmen extends Fragment {
    @BindView(R.id.behind_fragment_recyclerView)
    RecyclerView behindFragmentRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.behind_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public static BehindFragmen newInstance(String path) {

        Bundle args = new Bundle();
        args.putString("path", path);
        BehindFragmen fragment = new BehindFragmen();
        fragment.setArguments(args);
        return fragment;
    }
}
