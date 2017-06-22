package cn.bdqn.tangcco.tcmp054.entity;

import java.util.List;

/**
 * Created by lenovo on 2017/6/22.
 */
public class Street {
    private Integer streetId;
    private String streetName;
    private District district;
    private List<Community> communities;

    @Override
    public String toString() {
        return "Street{" +
                "streetId=" + streetId +
                ", streetName='" + streetName + '\'' +
                ", district=" + district +
                ", communities=" + communities +
                '}';
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }

    public Street(Integer streetId, String streetName, District district, List<Community> communities) {
        this.streetId = streetId;
        this.streetName = streetName;
        this.district = district;
        this.communities = communities;
    }

    public Street() {
    }
}
