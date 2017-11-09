package com.zeno.incrementupdate.ndk;

import android.os.Environment;

import java.io.File;

public class Constants {

	public static final String PATCH_FILE = "patch";
	public static final String URL_PATCH_DOWNLOAD = "http://192.168.192.138:8080/patch/"+ PATCH_FILE;
	
	public static final String SD_CARD = Environment.getExternalStorageDirectory() + File.separator + "patch" + File.separator;
	
	//新版本apk的目录
	public static final String NEW_APK_PATH = SD_CARD+"patch.apk";

	
}
