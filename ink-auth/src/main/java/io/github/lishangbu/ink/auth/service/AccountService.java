package io.github.lishangbu.ink.auth.service;

import io.github.lishangbu.ink.auth.entity.Account;

/**
 * 账户服务
 *
 * @author lishangbu
 * @date 2022/11/24
 */
public interface AccountService {

    /**
     * 根据账户名查询账户信息
     *
     * @param username 账户用户名
     * @return 数据库中存在的账户信息, 可为空
     */
    Account getByUsername(String username);

    /**
     * 保存账户
     *
     * @param account 待保存的账户信息
     * @return 保存后的账户信息
     */
    Account save(Account account);

    /**
     * 更新账户
     *
     * @param account 待更新的账户
     * @return 更新后的账户信息
     */
    Account updateById(Account account);

}
