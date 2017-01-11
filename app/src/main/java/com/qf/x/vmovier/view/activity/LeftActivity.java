package com.qf.x.vmovier.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.x.vmovier.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by X on 2017/1/10.
 */
public class LeftActivity extends AppCompatActivity {
    @BindView(R.id.left_back)
    ImageView leftBack;
    @BindView(R.id.left_set)
    ImageView leftSet;
    @BindView(R.id.left_voice)
    ImageView leftVoice;
    @BindView(R.id.left_login_tv)
    TextView leftLoginTv;
    @BindView(R.id.left_login)
    ImageView leftLogin;
    @BindView(R.id.left_lrucache)
    LinearLayout leftLrucache;
    @BindView(R.id.left_like)
    LinearLayout leftLike;
    @BindView(R.id.left_cache_like)
    LinearLayout leftCacheLike;
    @BindView(R.id.left_item_one_iv1)
    ImageView leftItemOneIv1;
    @BindView(R.id.left_item_one_iv2)
    ImageView leftItemOneIv2;
    @BindView(R.id.left_item_one_tv)
    TextView leftItemOneTv;
    @BindView(R.id.left_item_one)
    LinearLayout leftItemOne;
    @BindView(R.id.left_item_two_iv1)
    ImageView leftItemTwoIv1;
    @BindView(R.id.left_item_two_iv2)
    ImageView leftItemTwoIv2;
    @BindView(R.id.left_item_two_tv)
    TextView leftItemTwoTv;
    @BindView(R.id.left_item_two)
    LinearLayout leftItemTwo;
    @BindView(R.id.left_item_three_iv1)
    ImageView leftItemThreeIv1;
    @BindView(R.id.left_item_three_iv2)
    ImageView leftItemThreeIv2;
    @BindView(R.id.left_item_three_tv)
    TextView leftItemThreeTv;
    @BindView(R.id.left_item_three)
    LinearLayout leftItemThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.left);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.left_back, R.id.left_set, R.id.left_voice, R.id.left_login_tv, R.id.left_login, R.id.left_lrucache, R.id.left_like, R.id.left_item_one, R.id.left_item_two, R.id.left_item_three})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_back:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                this.finish();
                break;
            case R.id.left_set:
                Intent intent1 = new Intent(this, SetActivity.class);
                startActivity(intent1);
                break;
            case R.id.left_voice:
                break;
            case R.id.left_login_tv:
                break;
            case R.id.left_login:
                break;
            case R.id.left_lrucache:
                break;
            case R.id.left_like:
                break;
            case R.id.left_item_one:
//                leftItemOne.setBackgroundColor(Color.BLACK);
//                leftItemOneIv1.setBackgroundColor(getColor(R.color.text));
//                leftItemOneTv.setTextColor(getColor(R.color.text));
//                leftItemOneIv2.setImageResource(R.drawable.side_home);
//
//                leftItemTwo.setBackgroundColor(getColor(R.color.bg));
//                leftItemTwoIv1.setBackgroundColor(getColor(R.color.text_));
//                leftItemTwoTv.setTextColor(getColor(R.color.text_));
//                leftItemTwoIv2.setImageResource(R.drawable.side_series_);
//
//                leftItemThree.setBackgroundColor(getColor(R.color.bg));
//                leftItemThreeIv1.setBackgroundColor(getColor(R.color.text_));
//                leftItemThreeTv.setTextColor(getColor(R.color.text_));
//                leftItemThreeIv2.setImageResource(R.drawable.side_behind_);

                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                this.finish();
                break;
            case R.id.left_item_two:
//                leftItemOne.setBackgroundColor(getColor(R.color.bg));
//                leftItemOneIv1.setBackgroundColor(getColor(R.color.text_));
//                leftItemOneTv.setTextColor(getColor(R.color.text_));
//                leftItemOneIv2.setImageResource(R.drawable.side_home_);
//
//                leftItemTwo.setBackgroundColor(Color.BLACK);
//                leftItemTwoIv1.setBackgroundColor(getColor(R.color.text));
//                leftItemTwoTv.setTextColor(getColor(R.color.text));
//                leftItemTwoIv2.setImageResource(R.drawable.side_series);
//
//                leftItemThree.setBackgroundColor(getColor(R.color.bg));
//                leftItemThreeIv1.setBackgroundColor(getColor(R.color.text_));
//                leftItemThreeTv.setTextColor(getColor(R.color.text_));
//                leftItemThreeIv2.setImageResource(R.drawable.side_behind_);
                Intent intent3 = new Intent(this, SeriesActivity.class);
                startActivity(intent3);
                this.finish();
                break;
            case R.id.left_item_three:
//                leftItemOne.setBackgroundColor(getColor(R.color.bg));
//                leftItemOneIv1.setBackgroundColor(getColor(R.color.text_));
//                leftItemOneTv.setTextColor(getColor(R.color.text_));
//                leftItemOneIv2.setImageResource(R.drawable.side_home_);
//
//                leftItemTwo.setBackgroundColor(getColor(R.color.bg));
//                leftItemTwoIv1.setBackgroundColor(getColor(R.color.text_));
//                leftItemTwoTv.setTextColor(getColor(R.color.text_));
//                leftItemTwoIv2.setImageResource(R.drawable.side_series_);
//
//                leftItemThree.setBackgroundColor(Color.BLACK);
//                leftItemThreeIv1.setBackgroundColor(getColor(R.color.text));
//                leftItemThreeTv.setTextColor(getColor(R.color.text));
//                leftItemThreeIv2.setImageResource(R.drawable.side_behind);
                Intent intent4 = new Intent(this, BehindActivity.class);
                startActivity(intent4);
                this.finish();
                break;
        }
    }
}
