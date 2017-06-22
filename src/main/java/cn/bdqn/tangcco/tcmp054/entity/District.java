package cn.bdqn.tangcco.tcmp054.entity;

import java.util.List;

/**
 * Created by lenovo on 2017/6/22.
 */
public class District {
    private Integer districtId;
    private String districtName;
    private City city;
    private List<Street> streets;

    @Override
    public String toString() {
        return "District{" +
                "districtId=" + districtId +
                ", districtName='" + districtName + '\'' +
                ", city=" + city +
                ", streets=" + streets +
                '}';
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public District(Integer districtId, String districtName, City city, List<Street> streets) {
        this.districtId = districtId;
        this.districtName = districtName;
        this.city = city;
        this.streets = streets;
    }

    public District() {
    }
}
