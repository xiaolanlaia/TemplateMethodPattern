package com.example.templatemethodpattern;

import android.util.Log;

/**
 * Created by W on 2018/12/19.
 */

public class CoderComputer extends AbstractComputer {
    private static String TAG = "CoderComputer";

    @Override
    protected void login(){
        Log.d(TAG, "login: 程序员只需进行用户和密码验证就可以了");
    }
}
