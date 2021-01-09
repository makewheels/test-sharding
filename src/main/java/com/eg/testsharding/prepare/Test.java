package com.eg.testsharding.prepare;

import com.github.nobodxbodon.zhconverter.简繁转换类;

public class Test {
    public static void main(String[] args) {
        final 简繁转换类 简体转换器 = 简繁转换类.取实例(简繁转换类.目标.简体);
        String result = 简体转换器.转换("題義門胡氏華林書院");
        System.out.println(result);
    }
}
