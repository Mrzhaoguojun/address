package cn.bdqn.tangcco.tcmp054.entity;

/**
 * Created by lenovo on 2017/6/22.
 */
public class Community {
    private Integer communityId;
    private String communityName;
    private Street street;

    @Override
    public String toString() {
        return "Community{" +
                "communityId=" + communityId +
                ", communityName='" + communityName + '\'' +
                ", street=" + street +
                '}';
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public Community(Integer communityId, String communityName, Street street) {
        this.communityId = communityId;
        this.communityName = communityName;
        this.street = street;
    }

    public Community() {
    }
}
