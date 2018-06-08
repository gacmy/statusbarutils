package com.gac.statusbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecnodActivity extends AppCompatActivity {
   boolean flag;
   boolean flag1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setFitSystemWindow(false,this);
        setContentView(R.layout.activity_second);
    }

    /*
    * 改变状态栏字体颜色值 黑白
    * */
    public void onClikChageStatusTextColor(View view){
        StatusBarUtil.setStatusTextColor(!flag,this);
        flag = !flag;
    }

    /*
    * 改变状态透明
    * */
    public void onClickChangeStatusColorTransparent(View view){
        StatusBarUtil.setStatusBar(this);
    }

    /**
     * 去除透明背景
     * @param view
     */
    public void onClickExcludeBackground(View view){
        StatusBarUtil.excludeBackground(this);
    }

    /**
     * 是否适应窗口
     * @param view
     */
    public void onClickFitSystemWindow(View view){
        StatusBarUtil.setFitSystemWindow(!flag1,this);
        flag1 = !flag1;
    }
}
