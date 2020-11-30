package com.example.demo;

import com.example.demo.dao.NewsDao;
import com.example.demo.entity.News;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class test {

    @Test
    public void test()
    {
        NewsDao n=new NewsDao();
        List<Map> s,l,o;
        s=n.countNewsByDate();
        l=n.countNewsByAuthor();
        o=n.selectNewsByName("SuperCables");
        System.out.println(s);
        System.out.println(l);
        System.out.println(o);
    }

}
