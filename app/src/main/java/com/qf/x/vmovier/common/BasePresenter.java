package com.qf.x.vmovier.common;

/**
 * Created by X on 2017/1/10.
 */

public abstract class BasePresenter<T> {
    private IUiCallback<T> iUiCallback;

    public BasePresenter(IUiCallback<T> iUiCallback) {
        this.iUiCallback = iUiCallback;
    }

    public abstract void loadData();

    protected void loadData(ILoader<T> iLoader){
        iLoader.loadHttpData(this);
        iLoader.loadLocalData(this);
    }

    protected void refreshData(T data){
        iUiCallback.loadFinshData(data);
    }
}
