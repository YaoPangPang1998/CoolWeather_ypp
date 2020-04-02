package com.example.coolweather.util;

import com.example.coolweather.gson.Weather;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Weather_api {
    @GET("http://guolin.tech/")
    Observable<Weather> getCall();
}
