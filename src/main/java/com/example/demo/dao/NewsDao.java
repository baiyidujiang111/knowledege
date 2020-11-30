package com.example.demo.dao;

import com.example.demo.entity.News;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class NewsDao {
    public List<Map> countNewsByDate(){
        InputStream inputStream=NewsDao.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        List<Map> map=sqlSession.selectList("com.example.demo.Mapper.countNewsByDate");
        return map;
    }

    public List<Map> countNewsByAuthor(){
        InputStream inputStream=NewsDao.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        List<Map> map=sqlSession.selectList("com.example.demo.Mapper.countNewsByAuthor");
        return map;
    }

    public List<Map> selectNewsByName(String s)
    {
        InputStream inputStream=NewsDao.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        List<Map> news=sqlSession.selectList("com.example.demo.Mapper.selectNewsByName",s);
        return news;
    }

}
