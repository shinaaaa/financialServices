package com.shindorim.financialservices.member;

public class Member {
    private Long memberNum; // 고객 번호
    private String id;  // 고객 아이디
    private String name;    // 고객 이름
    private String phoneNum;    // 고객 전화번호
    private String password;    // 고객 비밀번호

    public Member(Long memberNum, String id, String name, String phoneNum, String password) {
        this.memberNum = memberNum;
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.password = password;
    }

    public Long getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Long memberNum) {
        this.memberNum = memberNum;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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
                "memberNum=" + memberNum +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
