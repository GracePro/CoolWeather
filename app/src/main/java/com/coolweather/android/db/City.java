package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by E-Ven on 2017/5/3.
 */

public class City extends DataSupport {
    private int id;
    private String CityName;
    private int cityCode;
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {

        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {

        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
