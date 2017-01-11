package com.qf.x.vmovier.presenter;

import com.qf.x.vmovier.common.API;
import com.qf.x.vmovier.common.BasePresenter;
import com.qf.x.vmovier.common.ILoader;
import com.qf.x.vmovier.common.IUiCallback;
import com.qf.x.vmovier.common.RetrofitX;
import com.qf.x.vmovier.entity.Home_New;

import retrofit.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by X on 2017/1/11.
 */

public class Home_NewPresenter extends BasePresenter<Home_New>{

    private String cacherControl;
    private int page;
    private int size;
    public Home_NewPresenter(IUiCallback<Home_New> iUiCallback,int page,int size) {
        super(iUiCallback);
        this.page=page;
        this.size=size;
    }

    @Override
    public void loadData() {
        loadData(new ILoader<Home_New>() {
            @Override
            public void loadHttpData(BasePresenter<Home_New> presenter) {
                Retrofit retrofit = RetrofitX.getRetrofit();
                API api = retrofit.create(API.class);
                Observable<Home_New> home_new = api.getHome_New(page, size);
                home_new.observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.newThread())
                        .subscribe(new Action1<Home_New>() {
                            @Override
                            public void call(Home_New home_new) {
                                refreshData(home_new);
                            }
                        });
            }

            @Override
            public void loadLocalData(BasePresenter<Home_New> presenter) {

            }
        });
    }
}
