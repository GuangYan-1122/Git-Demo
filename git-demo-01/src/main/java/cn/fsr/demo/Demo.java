package cn.fsr.demo;

import com.google.common.base.Strings;

public class Demo {

    public static void main(String[] args) {
        String string = "其实快乐很简单";
        boolean isNull = Strings.isNullOrEmpty(string);
        System.out.println("其实快乐很简单:" + !isNull);
    }

}
