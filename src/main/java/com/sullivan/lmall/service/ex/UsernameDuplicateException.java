package com.sullivan.lmall.service.ex;

/**
 * 描述 用户名被占用的异常
 *
 * @author : 小蚊子
 * @date : 2021-10-16 14:14
 **/
public class UsernameDuplicateException extends ServiceException {
    public UsernameDuplicateException() {
        super();
    }

    public UsernameDuplicateException(String message) {
        super(message);
    }

    public UsernameDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameDuplicateException(Throwable cause) {
        super(cause);
    }

    protected UsernameDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}