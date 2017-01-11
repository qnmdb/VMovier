package com.qf.x.vmovier.common;

import com.qf.x.vmovier.entity.Home_New;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by X on 2017/1/10.
 */

public interface API {
    public static final String LL="";
    @GET("apiv3/post/getPostByTab")
    Observable<Home_New> getHome_New(@Query("p") int page, @Query("size") int num);
}
