package io.github.lishangbu.ink.auth.service.impl;

import io.github.lishangbu.ink.auth.entity.Account;
import io.github.lishangbu.ink.auth.repository.AccountRepository;
import io.github.lishangbu.ink.auth.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 账户服务实现类
 *
 * @author lishangbu
 * @date 2022/11/24
 */
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Account getByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateById(Account account) {
        return accountRepository.save(account);
    }
}
