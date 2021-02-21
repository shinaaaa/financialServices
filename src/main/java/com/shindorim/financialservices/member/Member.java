package com.shindorim.financialservices.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_num; // 고객 번호
    private String id;  // 고객 아이디
    private String name;    // 고객 이름
    private String phone_num;    // 고객 전화번호
    private String password;    // 고객 비밀번호

    public Long getMember_num() {
        return member_num;
    }

    public void setMember_num(Long memberNum) {
        this.member_num = memberNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phoneNum) {
        this.phone_num = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNum=" + member_num +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phone_num + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
