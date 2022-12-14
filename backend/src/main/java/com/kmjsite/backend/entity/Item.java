package com.kmjsite.backend.entity;

import lombok.Getter;

import javax.persistence.*;

//items라는 테이블과 item이라는 클래스와 연결, JPA 매핑 작업
@Table(name="items")
@Entity
@Getter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100)
    private String imgPath;

    @Column
    private String price;

    @Column
    private String discountPer;
}
