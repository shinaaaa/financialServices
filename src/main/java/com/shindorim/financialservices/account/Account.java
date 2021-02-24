package com.shindorim.financialservices.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private Long member_num; // 고객 번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String account_num;  // 고객 계좌 번호
    private int account_pw;  // 고객 계좌 비밀번호
    private Long balance;   // 고객 계좌 잔액
    private boolean available;  // 고객 계좌 사용 가능 여부

    public Long getMember_num() {
        return member_num;
    }

    public void setMember_num(Long member_num) {
        this.member_num = member_num;
    }

    public String getAccount_num() {
        return account_num;
    }

    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

    public int getAccount_pw() {
        return account_pw;
    }

    public void setAccount_pw(int account_pw) {
        this.account_pw = account_pw;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
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
                "member_num=" + member_num +
                ", account_num='" + account_num + '\'' +
                ", account_pw=" + account_pw +
                ", balance=" + balance +
                ", available=" + available +
                '}';
    }
}
