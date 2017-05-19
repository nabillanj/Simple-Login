package com.nabilla.task3;

import com.nabilla.task3.POJO.UserPOJO;
import com.nabilla.task3.POJO.UsersPOJO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST("/v2/5912ca540f0000c802f857bf")
    @FormUrlEncoded
    Call<UsersPOJO> postData(@Field("email") String email,
                             @Field("password") String password);

    @GET("/v2/5912ca540f0000c802f857bf")
    Call<UsersPOJO> getData();

}
