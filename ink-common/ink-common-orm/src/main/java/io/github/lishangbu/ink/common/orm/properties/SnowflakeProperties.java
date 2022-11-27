package io.github.lishangbu.ink.common.orm.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 雪花算法配置
 *
 * @author lishangbu
 * @date 2022/11/25
 */
@Data
@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = SnowflakeProperties.PREFIX)
public class SnowflakeProperties {

    public static final String PREFIX = "snow-flake";

    /**
     * 终端ID
     */
    private Long workerId = 0L;
    /**
     * 数据中心ID
     */
    private Long dataCenterId = 0L;

}
