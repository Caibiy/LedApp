package com.example.administrator.raspberrypi;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018/3/10.
 */

public interface LedInterface {
    @POST("led")
    Call<ResponseBody> controlLEd();
    @GET("detect")
    Call<ResponseBody> detect();
}
