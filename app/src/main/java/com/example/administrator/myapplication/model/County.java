package com.example.administrator.myapplication.model;

/**
 * Created by Administrator on 2019/3/21 0021.
 */

public class County {
    private int id;
    private String countyName;
    private String waetherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWaetherId() {
        return waetherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyNamee(String countyNamee) {
        this.countyName = countyNamee;
    }

    public void setWaetherId(String waetherId) {
        this.waetherId = waetherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
