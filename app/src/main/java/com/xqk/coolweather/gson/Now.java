package com.xqk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xuqin on 2017/8/24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
