package com.kmjsite.backend.entity;

import lombok.Getter;

import javax.persistence.*;

//memebrs라는 테이블과 member라는 클래스와 연결, JPA 매핑 작업
@Table(name="members")
@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;


}
