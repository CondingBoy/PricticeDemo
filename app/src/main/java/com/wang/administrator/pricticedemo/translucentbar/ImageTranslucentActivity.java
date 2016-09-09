package com.wang.administrator.pricticedemo.translucentbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;

import com.wang.administrator.pricticedemo.R;

public class ImageTranslucentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //继承自AppCompatActivity需要使用这个方法来取消actionBar
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_image_translucent);
//        getSupportActionBar().hide();
        Toast.makeText(this,"abc",Toast.LENGTH_SHORT).show();
    }
}
