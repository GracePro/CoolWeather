package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by E-Ven on 2017/5/3.
 */

public class County extends DataSupport {
    private int id;
    private String contyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContryName() {

        return contyName;
    }

    public void setContryName(String contryName) {
        this.contyName = contryName;
    }

    public String getWeatherId() {

        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {

        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
