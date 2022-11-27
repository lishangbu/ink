package io.github.lishangbu.ink.common.core.result;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * API调用结果
 *
 * @author Hccake
 * @author lishangbu
 * @date 2022/11/24
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;


    public static <T> ApiResult<T> ok() {
        return ok(null);
    }

    public static <T> ApiResult<T> ok(T data) {
        return new ApiResult<T>().setCode(ApiResultCode.SUCCESS.getCode()).setData(data)
                .setMessage(ApiResultCode.SUCCESS.getMessage());
    }

    public static <T>  ApiResult<T> ok(T data, String message) {
        return new ApiResult<T>().setCode(ApiResultCode.SUCCESS.getCode()).setData(data).setMessage(message);
    }

    public static <T> ApiResult<T> failed(int code, String message) {
        return new ApiResult<T>().setCode(code).setMessage(message);
    }

    public static <T> ApiResult<T> failed(ResultCode failMsg) {
        return new ApiResult<T>().setCode(failMsg.getCode()).setMessage(failMsg.getMessage());
    }

    public static <T> ApiResult<T> failed(ResultCode failMsg, String message) {
        return new ApiResult<T>().setCode(failMsg.getCode()).setMessage(message);
    }
}
