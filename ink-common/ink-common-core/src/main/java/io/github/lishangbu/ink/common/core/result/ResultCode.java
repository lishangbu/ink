package io.github.lishangbu.ink.common.core.result;

/**
 * 结果状态码
 *
 * @author Hccake
 * @author lishangbu
 * @date 2022/11/24
 */
public interface ResultCode {
    /**
     * 获取业务码
     *
     * @return 业务码
     */
    Integer getCode();

    /**
     * 获取信息
     *
     * @return 返回结构体中的信息
     */
    String getMessage();
}
