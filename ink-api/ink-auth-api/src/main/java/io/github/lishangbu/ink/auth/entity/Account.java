package io.github.lishangbu.ink.auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

import static io.github.lishangbu.ink.common.orm.constant.SnowFlakeIdConstants.GENERATOR_NAME;
import static io.github.lishangbu.ink.common.orm.constant.SnowFlakeIdConstants.GENERATOR_STRATEGY;

/**
 * 账户信息
 *
 * @author lishangbu
 * @date 2022/11/24
 */
@Entity
@Data
public class Account implements Serializable {

    @Id
    @GeneratedValue(generator = GENERATOR_NAME)
    @GenericGenerator(name = GENERATOR_NAME, strategy = GENERATOR_STRATEGY)
    @Comment("主键")
    private Long id;

    /**
     * 用户名
     */
    @Column(length = 50, unique = true, nullable = false)
    @Comment("用户名")
    private String username;

    /**
     * 密码
     */
    @Column(length = 64, nullable = false)
    @Comment("密码")
    private String password;

}
