package com.tencent.qcloud.tim.uikit.utils;

import com.tencent.imsdk.log.QLog;

public class TUIKitLog extends QLog {
    public static final String PRE_EXT = "TUIKit-NPF";

    private static final String PRE = "TUIKit-";

    private static String mixTag(String tag) {
        return PRE + tag;
    }

    /**
     * 打印INFO级别日志
     *
     * @param strTag  TAG
     * @param strInfo 消息
     */
    public static void v(String strTag, String strInfo) {
        QLog.v(mixTag(strTag), strInfo);
    }

    /**
     * 打印DEBUG级别日志
     *
     * @param strTag  TAG
     * @param strInfo 消息
     */
    public static void d(String strTag, String strInfo) {
        QLog.d(mixTag(strTag), strInfo);
    }

    /**
     * 打印INFO级别日志
     *
     * @param strTag  TAG
     * @param strInfo 消息
     */
    public static void i(String strTag, String strInfo) {
        QLog.i(mixTag(strTag), strInfo);
    }

    /**
     * 打印WARN级别日志
     *
     * @param strTag  TAG
     * @param strInfo 消息
     */
    public static void w(String strTag, String strInfo) {
        QLog.w(mixTag(strTag), strInfo);
    }

    /**
     * 打印WARN级别日志
     *
     * @param strTag  TAG
     * @param strInfo 消息
     */
    public static void w(String strTag, String strInfo, Throwable e) {
        QLog.w(mixTag(strTag), strInfo + e.getMessage());
    }

    /**
     * 打印ERROR级别日志
     *
     * @param strTag  TAG
     * @param strInfo 消息
     */
    public static void e(String strTag, String strInfo) {
        QLog.e(mixTag(strTag), strInfo);
    }


    /**
     * 打印INFO级别日志
     *
     * @param strInfo 消息
     */
    public static void v(String strInfo) {
        QLog.v(PRE_EXT, strInfo);
    }

    /**
     * 打印DEBUG级别日志
     *
     * @param strInfo 消息
     */
    public static void d(String strInfo) {
        QLog.d(PRE_EXT, strInfo);
    }

    /**
     * 打印INFO级别日志
     *
     * @param strInfo 消息
     */
    public static void i(String strInfo) {
        QLog.i(PRE_EXT, strInfo);
    }

    /**
     * 打印WARN级别日志
     *
     * @param strInfo 消息
     */
    public static void w(String strInfo) {
        QLog.w(PRE_EXT, strInfo);
    }

    /**
     * 打印WARN级别日志
     *
     * @param strInfo 消息
     */
    public static void w(String strInfo, Throwable e) {
        QLog.w(PRE_EXT, strInfo + e.getMessage());
    }

    /**
     * 打印ERROR级别日志
     *
     * @param strInfo 消息
     */
    public static void e(String strInfo) {
        QLog.e(PRE_EXT, strInfo);
    }

}
