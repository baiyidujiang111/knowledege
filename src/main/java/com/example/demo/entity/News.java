package com.example.demo.entity;

import lombok.Data;

@Data
public class News {
    int num;

    int id;
    String create_user;
    String create_time;
    String modify_user;
    String modify_time;
    String detail;
    String title;
    String author;
    String date;
    String url;
    String category;
    int importance;

    public News(
            int id,
            String create_user,
            String create_time,
            String modify_user,
            String modify_time,
            String detail,
            String title,
            String author,
            String date,
            String url,
            String category,
            int importance)
    {
        this.id=id;
        this.create_user=create_user;
        this.create_time=create_time;
        this.modify_time=modify_time;
        this.modify_user=modify_user;
        this.detail=detail;
        this.title=title;
        this.date=date;
        this.url=url;
        this.importance=importance;
        this.category=category;
        this.author=author;
    }
}
