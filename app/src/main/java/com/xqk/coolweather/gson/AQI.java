package com.xqk.coolweather.gson;

/**
 * Created by xuqin on 2017/8/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
