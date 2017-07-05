package com.liking.shellapp;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created on 2017/07/05
 * desc:
 *
 * @author: chenlei
 * @version:1.0
 */

public class ShellApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        ActivityThread activityThread = ActivityThread.currentActivityThread();
        Log.e("info",activityThread.toString());
    }
}
