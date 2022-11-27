package io.github.lishangbu.ink.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static io.github.lishangbu.ink.common.core.constant.ScanPackageConstants.*;

/**
 * 应用启动器
 *
 * @author lishangbu
 */
@EntityScan(JPA_ENTITY_PACKAGE)
@EnableJpaRepositories(basePackages = JPA_REPOSITORY_PACKAGE)
@SpringBootApplication(proxyBeanMethods = false, scanBasePackages = BASE_PACKAGE)
public class InkLauncher {

    public static void main(String[] args) {
        SpringApplication.run(InkLauncher.class, args);
    }

}
