package com.shindorim.financialservices.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    /**
     * 계좌 생성
     *
     * @param account 계좌 정보
     */
    @Override
    public void open(Account account) {
        accountRepository.open(account);
    }

    /**
     * 비밀번호 초기화
     *
     * @param memberNum  고객 번호
     * @param accountNum 고객 계좌 번호
     */
    @Override
    public void resetPassWord(Long memberNum, String accountNum) {
        accountRepository.resetPassWord(memberNum, accountNum);
    }

    /**
     * 회원 찾기
     *
     * @param memberNum 회원 번호
     * @return 회원 정보
     */
    @Override
    public Optional<Account> findByMemberNum(Long memberNum) {
        return Optional.empty();
    }
    
    @Override
    public List<Account> findAllAccount() {
        return null;
    }
}
