package io.github.lishangbu.ink.common.orm.id;

import cn.hutool.core.lang.Snowflake;
import io.github.lishangbu.ink.common.orm.properties.SnowflakeProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 雪花配置
 *
 * @author lishangbu
 * @date 2022/11/25
 */
@Component
@RequiredArgsConstructor
public class SnowFlakeConfig {
    private final SnowflakeProperties snowflakeProperties;

    @Bean
    public Snowflake snowflake() {
        return new Snowflake(snowflakeProperties.getWorkerId(),snowflakeProperties.getDataCenterId());
    }
}
