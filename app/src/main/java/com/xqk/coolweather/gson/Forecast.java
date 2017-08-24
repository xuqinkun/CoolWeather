package com.xqk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xuqin on 2017/8/24.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temprature temprature;

    @SerializedName("cond")
    public More more;

    public class Temprature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
