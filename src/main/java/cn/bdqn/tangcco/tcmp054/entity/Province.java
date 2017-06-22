package cn.bdqn.tangcco.tcmp054.entity;

import java.util.List;

/**
 * Created by lenovo on 2017/6/22.
 */
public class Province {
    private Integer provinceId;
    private String provinceName;
    private List<City> cities;

    @Override
    public String toString() {
        return "Province{" +
                "provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                ", cities=" + cities +
                '}';
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Province(Integer provinceId, String provinceName, List<City> cities) {
        this.provinceId = provinceId;
        this.provinceName = provinceName;
        this.cities = cities;
    }

    public Province() {
    }
}
