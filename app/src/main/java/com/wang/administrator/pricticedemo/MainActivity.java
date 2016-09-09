package com.wang.administrator.pricticedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wang.administrator.pricticedemo.mdwidget.ToolbarActivity;
import com.wang.administrator.pricticedemo.mdwidget.ZhihuToolbarActivity;
import com.wang.administrator.pricticedemo.translucentbar.ColorTranslucentActivity;
import com.wang.administrator.pricticedemo.translucentbar.ImageTranslucentActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.bt_color_translucent)
    Button btColorTranslucent;
    @InjectView(R.id.bt_image_translucent)
    Button btImageTranslucent;
    @InjectView(R.id.bt_toolbar)
    Button btToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.bt_color_translucent, R.id.bt_image_translucent,
            R.id.bt_toolbar,R.id.bt_zhihutoolbar})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_color_translucent:
                Intent intent = new Intent(this, ColorTranslucentActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_image_translucent:
                Intent intent2 = new Intent(this, ImageTranslucentActivity.class);
                startActivity(intent2);
                break;
            case R.id.bt_toolbar:
                Intent intent3 = new Intent(this, ToolbarActivity.class);
                startActivity(intent3);
                break;
            case R.id.bt_zhihutoolbar:
                Intent intent4 = new Intent(this, ZhihuToolbarActivity.class);
                startActivity(intent4);
                break;
        }
    }


}
