package com.wzf.sdiff;

/**
 * @Description:
 * @author: wangzhenfei
 * @date: 2017-11-08 15:57
 */

public class SdiffHelper {
    static {
        System.loadLibrary("sdiff");
    }
    public native static void diff(String oldFile, String newFile, String patch);

}


