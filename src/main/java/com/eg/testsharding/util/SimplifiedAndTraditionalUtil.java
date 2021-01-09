package com.eg.testsharding.util;

import com.github.nobodxbodon.zhconverter.简繁转换类;

/**
 * 简体繁体转换工具类
 */
public class SimplifiedAndTraditionalUtil {
    /**
     * 繁体转简体
     *
     * @param traditional
     * @return
     */
    public static String traditionalToSimplified(String traditional) {
        return 简繁转换类.取实例(简繁转换类.目标.简体).转换(traditional);
    }

    /**
     * 简体转繁体
     *
     * @param simplified
     * @return
     */
    public static String simplifiedToTraditional(String simplified) {
        return 简繁转换类.取实例(简繁转换类.目标.繁体).转换(simplified);
    }
}
