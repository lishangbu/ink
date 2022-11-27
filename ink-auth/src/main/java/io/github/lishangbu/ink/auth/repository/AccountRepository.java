package io.github.lishangbu.ink.auth.repository;

import io.github.lishangbu.ink.auth.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 账户数据存储
 *
 * @author lishangbu
 * @date 2022/11/24
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByUsername(String username);
}
