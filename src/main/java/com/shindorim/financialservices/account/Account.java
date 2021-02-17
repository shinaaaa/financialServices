package com.shindorim.financialservices.account;

public class Account {
    private Long memberNum; // 고객 번호
    private String accountNum;  // 고객 계좌 번호
    private int accountPw;  // 고객 계좌 비밀번호
    private boolean available;  // 고객 계좌 사용 가능 여부

    public Long getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Long memberNum) {
        this.memberNum = memberNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public int getAccountPw() {
        return accountPw;
    }

    public void setAccountPw(int accountPw) {
        this.accountPw = accountPw;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Account{" +
                "memberNum='" + memberNum + '\'' +
                ", accountNum='" + accountNum + '\'' +
                ", accountPw='" + accountPw + '\'' +
                ", available=" + available +
                '}';
    }
}
