package com.wang.administrator.pricticedemo.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/9/1 0001.
 */
public class Toasts {
    private static Context mContext;
    private static String oldMsg;
    private static Toast mToast=null;
    private static long oneTime=0;
    private static long twoTime=0;
    private Toasts(){
    }
    public static void registToasts(Context context){
        mContext=context.getApplicationContext();
    }
    private static void check(){
        if(mContext==null){
            throw new NullPointerException("Must initial call ToastUtils.register(Context context) in your " +
                    "<? " +
                    "extends Application class>");
        }
    }
    public static void shortShow(@NonNull String text){
        check();
        Toast.makeText(mContext,text,Toast.LENGTH_SHORT).show();
    }

    /**
     * 禁止重复弹出
     * @param text
     */
    public static void shortShowNoRepet(@NonNull String text){
        check();
        if(mToast==null){
            oneTime=System.currentTimeMillis();
            mToast=Toast.makeText(mContext,text,Toast.LENGTH_SHORT);
            mToast.show();
            oldMsg=text;
        }else {
            twoTime=System.currentTimeMillis();
            if(text.equals(oldMsg)){
                if(twoTime-oneTime>2000){
                    mToast.show();
                    oneTime=twoTime;
                }
            }else {
                mToast.setText(text);
                mToast.show();
                oldMsg=text;
                oneTime=twoTime;
            }
        }
    }
    public static void shortShow(@StringRes int resId){
        check();
        Toast.makeText(mContext,resId,Toast.LENGTH_SHORT).show();
    }
}
