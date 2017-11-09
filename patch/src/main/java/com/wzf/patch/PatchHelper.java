package com.wzf.patch;

/**
 * @Description:
 * @author: wangzhenfei
 * @date: 2017-11-09 10:23
 */

public class PatchHelper {
    static {
        System.loadLibrary("patch");
    }
    public native static void patch(String oldFile, String newFile, String patch);
}
