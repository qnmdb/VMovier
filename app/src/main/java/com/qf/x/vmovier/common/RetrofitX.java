package com.qf.x.vmovier.common;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by X on 2017/1/11.
 */

public class RetrofitX {
    private static Retrofit retrofit;
    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit=new Retrofit.Builder()
                    .baseUrl("http://app.vmoiver.com/")//请求的Base目录，用于拼接
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//生成对象的工厂类，用于适配对象
                    .addConverterFactory(GsonConverterFactory.create())//Gson解析工厂类，用于解析
                    .build();
        }
        return retrofit;
    }
}
