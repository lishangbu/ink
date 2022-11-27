package io.github.lishangbu.ink.auth.controller;

import io.github.lishangbu.ink.auth.entity.Account;
import io.github.lishangbu.ink.auth.service.AccountService;
import io.github.lishangbu.ink.common.core.result.ApiResult;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 账户控制器
 *
 * @author lishangbu
 * @date 2022/11/24
 */
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    /**
     * 保存账户信息
     *
     * @param account
     * @return
     */
    @PostMapping
    public ApiResult<Account> save(@RequestBody @Valid Account account) {
        return ApiResult.ok(accountService.save(account));
    }

    @PutMapping
    public ApiResult<Account> updateById(@RequestBody @Valid Account account) {
        return ApiResult.ok(accountService.updateById(account));
    }


}
