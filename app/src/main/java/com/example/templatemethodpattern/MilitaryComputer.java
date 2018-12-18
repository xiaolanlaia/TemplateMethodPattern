package com.example.templatemethodpattern;

import android.util.Log;

/**
 * Created by W on 2018/12/19.
 */

public class MilitaryComputer extends AbstractComputer {
    private static String TAG = "MilitaryComputer";
    @Override
    protected void checkHardware(){
        super.checkHardware();
        Log.d(TAG, "checkHardware: 检查硬件防火墙");
    }
    @Override
    protected void login(){
        Log.d(TAG, "login: 进行指纹识别等复杂用户验证");
    }
}
