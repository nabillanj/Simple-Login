package com.nabilla.task3;

import com.nabilla.task3.Model.Users;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("/v2/5912ca540f0000c802f857bf")
    @FormUrlEncoded
    Call<Users> postData(@Field("email") String email,
                         @Field("password") String password);

    @GET("/v2/5912ca540f0000c802f857bf")
    Call<Users> getData();

}
