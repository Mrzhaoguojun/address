package cn.bdqn.tangcco.tcmp054.test.conn;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;

/**
 * Created by lenovo on 2017/6/22.
 */
public class TestConn {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    @Before
    public void init(){
        try {
            this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            this.sqlSession = this.sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void conn(){
        Connection connection = this.sqlSession.getConnection();
        if (connection!=null){
            System.out.println("success");
        }else {
            System.out.println("failed");
        }
    }
}
