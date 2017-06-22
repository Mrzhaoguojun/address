package cn.bdqn.tangcco.tcmp054.entity;

import java.util.List;

/**
 * Created by lenovo on 2017/6/22.
 */
public class City {
    private Integer cityId;
    private String cityName;
    private Province province;
    private List<District> districts;

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", province=" + province +
                ", districts=" + districts +
                '}';
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public City(Integer cityId, String cityName, Province province, List<District> districts) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.province = province;
        this.districts = districts;
    }

    public City() {
    }
}
