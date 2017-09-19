package com.sononpos.animalvideos.dogandcatvideos.Funtional;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by nnnyy on 2017-09-16.
 */

public class LogHelper {
    public static boolean isDebug = false;
    public static void init(Context context) {
        try {
            ApplicationInfo info = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            isDebug = ((info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void de(String s) {
        if(isDebug) {
            Log.e("LogHelper", s);
        }
    }

    public static void dd(String s) {
        if(isDebug) {
            Log.d("LogHelper", s);
        }
    }

    public static void di(String s) {
        if(isDebug) {
            Log.i("LogHelper", s);
        }
    }

    public static void dv(String s) {
        if(isDebug) {
            Log.v("LogHelper", s);
        }
    }

    public static void dw(String s) {
        if(isDebug) {
            Log.w("LogHelper", s);
        }
    }
}
