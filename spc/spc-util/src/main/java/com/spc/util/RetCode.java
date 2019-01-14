package com.spc.util;

/**
 * <p>  </p>
 *
 * @author Young
 * @since 2019-01-14
 */
public interface RetCode {

    /**
     * 成功
     */
    int SUCCESS = 200;

    /**
     * 异常
     */
    int ERROR = 500;

    /**
     * 没有数据
     */
    int UNFIND = 404;

    /**
     * 服务器拒绝
     */
    int REFUSE = 403;

    /**
     * 重复提交
     */
    int REPEAT = 808;

    /**
     * 没有身份认证
     */
    int UNAUTH = 401;
}
