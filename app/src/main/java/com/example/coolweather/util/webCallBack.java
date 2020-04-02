package com.example.coolweather.util;

import com.example.coolweather.gson.Weather;

public interface webCallBack {
    void succeed(Weather weather);
    void fali(String errMSG);
}
