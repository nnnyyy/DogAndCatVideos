package com.sononpos.animalvideos.dogandcatvideos.Funtional;

import android.support.compat.BuildConfig;
import android.util.Log;

/**
 * Created by nnnyy on 2017-09-16.
 */

public class LogHelper {
    public static void de(String s) {
        if(BuildConfig.DEBUG) {
            Log.e("LogHelper", s);
        }
    }

    public static void dd(String s) {
        if(BuildConfig.DEBUG) {
            Log.d("LogHelper", s);
        }
    }

    public static void di(String s) {
        if(BuildConfig.DEBUG) {
            Log.i("LogHelper", s);
        }
    }

    public static void dv(String s) {
        if(BuildConfig.DEBUG) {
            Log.v("LogHelper", s);
        }
    }

    public static void dw(String s) {
        if(BuildConfig.DEBUG) {
            Log.w("LogHelper", s);
        }
    }
}