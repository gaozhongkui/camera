package com.android.camera.util;

import android.os.Build;

/**
 * Created by gaozhongkui on 2017/4/16.
 */

public class SystemVersionUtil {

    public static boolean hasOSVersion17() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }
}
