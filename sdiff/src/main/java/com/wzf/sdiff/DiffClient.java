package com.wzf.sdiff;

/**
 * @Description:
 * @author: wangzhenfei
 * @date: 2017-11-08 18:59
 */

public class DiffClient {
    public static void main(String[] args) {
//        SdiffHelper.diff("F:\\libs\\diffUpdate\\test\\123_old.txt", "F:\\libs\\diffUpdate\\test\\123_new.txt", "F:\\libs\\diffUpdate\\test\\patch");
        SdiffHelper.diff("F:\\libs\\diffUpdate\\apkTest\\old.apk", "F:\\libs\\diffUpdate\\apkTest\\new.apk", "F:\\libs\\diffUpdate\\apkTest\\patch");
    }
}
