package com.qf.x.vmovier.common;

/**
 * Created by X on 2017/1/10.
 */

public interface ILoader<T> {
    void loadHttpData(BasePresenter<T> presenter);
    void loadLocalData(BasePresenter<T> presenter);
}
