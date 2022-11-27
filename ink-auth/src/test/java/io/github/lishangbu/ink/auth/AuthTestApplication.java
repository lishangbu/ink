package io.github.lishangbu.ink.auth;

import io.github.lishangbu.ink.common.core.constant.ScanPackageConstants;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 分模块情况下为了拉起spring测试环境
 *
 * @author lishangbu
 * @date 2022/11/26
 */
@ComponentScan(basePackages = ScanPackageConstants.BASE_PACKAGE)
@SpringBootApplication
public class AuthTestApplication {
}
