package com.example.springcttask.Activity;

import com.example.springcttask.LoginRequest;
import com.example.springcttask.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("login")
    Call<LoginResponse> login(@Body LoginRequest request);
}
