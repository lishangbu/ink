package io.github.lishangbu.ink.auth.service;

import io.github.lishangbu.ink.auth.entity.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 账户功能测试
 *
 * @author lishangbu
 * @date 2022/11/26
 */
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testAddAccount() {
        Account param = new Account();
        param.setUsername("test");
        param.setPassword("test");
        Account account = accountService.save(param);
        Assertions.assertEquals("test", account.getUsername());
        Assertions.assertNotNull(account.getId());
    }

    @Test
    public void testGetAccountByUsername() {
        // admin 是自动导入的一个用户
        Account account = accountService.getByUsername("admin");
        Assertions.assertNotNull(account);
    }
}
