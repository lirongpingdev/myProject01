package com.es.jpa.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@Document(indexName="user01")
public class User {

    @Id
    private String id;

    @Field(type = FieldType.Text, name = "user_name")
    private String name;

    @Field(type = FieldType.Integer, name = "user_age")
    private int age = 18;

    @Field(type = FieldType.Text, name="user_create_times")
    private String createTime;

    @Field(type = FieldType.Date, name = "add_times",format= DateFormat.date_hour_minute_second_millis )
    private Date addTime = new Date();

    @Field(type = FieldType.Date, name = "test_times",format= DateFormat.date_hour_minute_second_millis )
    private Date testTime = new Date();

    Contact contact ;

    public User(String id, String name, int age, String createTime, Contact contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.createTime = createTime;
        this.contact = contact;
    }
}
