package com.coolweather.android.gson;

/**
 * Created by E-Ven on 2017/5/5.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
