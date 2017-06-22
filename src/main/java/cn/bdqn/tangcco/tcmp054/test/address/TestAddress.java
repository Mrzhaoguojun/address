package cn.bdqn.tangcco.tcmp054.test.address;

import cn.bdqn.tangcco.tcmp054.address.dao.CommunityMapper;
import cn.bdqn.tangcco.tcmp054.entity.Community;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by lenovo on 2017/6/22.
 */
public class TestAddress {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private CommunityMapper communityMapper;
    @Before
    public void init(){
        try {
            this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            this.sqlSession = this.sqlSessionFactory.openSession();
            this.communityMapper=this.sqlSession.getMapper(CommunityMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddress(){
        Community community = this.communityMapper.detail(3);
        System.out.println("送货地址:"+
        community.getStreet().getDistrict().getCity().getProvince().getProvinceName()+"\t"
                +community.getStreet().getDistrict().getCity().getCityName()+"\t"
                +community.getStreet().getDistrict().getDistrictName()+"\t"
                +community.getStreet().getStreetName()+"\t"
                +community.getCommunityName());
    }
}
