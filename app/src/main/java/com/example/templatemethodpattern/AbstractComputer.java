package com.example.templatemethodpattern;

import android.util.Log;

/**
 * Created by W on 2018/12/19.
 */

public abstract class AbstractComputer {
    private static String TAG = "AbatractComputer";

    protected void powerOn(){
        Log.d(TAG, "powerOn: 开启电源");
    }
    protected void checkHardware(){
        Log.d(TAG, "checkHardware: 硬件检查");
    }
    protected void loadOS(){
        Log.d(TAG, "loadOS: 载入操作系统");
    }
    protected void login(){
        Log.d(TAG, "login: 进入系统");
    }
    /**
     * 启动计算机方法，步骤固定为开启电源，系统检查，加载操作系统，用户登录。该方法为final，防止算法框架被复写。
     */
    public final void startUp(){
        Log.d(TAG, "startUp: ----关机 START----");
        powerOn();
        checkHardware();
        loadOS();
        login();
    }
}
