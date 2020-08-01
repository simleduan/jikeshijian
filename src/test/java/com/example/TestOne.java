package com.example;import org.apache.ibatis.io.Resources;import org.apache.ibatis.session.SqlSession;import org.apache.ibatis.session.SqlSessionFactory;import org.apache.ibatis.session.SqlSessionFactoryBuilder;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringRunner;import java.io.InputStream;import java.sql.Connection;import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.Statement;@SpringBootTest@RunWith(SpringRunner.class)public class TestOne {    @Autowired    private SqlSessionFactory sqlSessionFactory;    @Test    public void test2() throws Exception {        Class.forName("com.mysql.cj.jdbc.Driver");        String url ="jdbc:mysql://localhost:3306/mp";        String username ="root";        String password ="root";        Connection connection = DriverManager.getConnection(url, username, password);        Statement statement = connection.createStatement();        String sql = "select * from person";        statement.execute(sql);        ResultSet resultSet = statement.getResultSet();        while (resultSet.next()){            System.out.println(resultSet.getString("name"));        }    }    @Test    public void test1() throws Exception {        String path = "config/mybatis-config.xml";        InputStream resourceAsStream = Resources.getResourceAsStream(path);        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);        SqlSession sqlSession = build.openSession();//        PersonDAO mapper = sqlSession.getMapper(PersonDAO.class);//        Person person = mapper.selectByPrimaryKey(1);//        System.out.println(person);    }    @Test    public void test() {        SqlSession sqlSession = sqlSessionFactory.openSession();//        PersonDAO mapper = sqlSession.getMapper(PersonDAO.class);//        Person person = mapper.selectByPrimaryKey(1);//        System.out.println(person);    }}