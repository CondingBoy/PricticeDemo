package com.wang.administrator.pricticedemo.mdwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;

import com.wang.administrator.pricticedemo.R;
import com.wang.administrator.pricticedemo.util.Toasts;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ZhihuToolbarActivity extends AppCompatActivity {

    @InjectView(R.id.tb_zhihu)
    Toolbar tbZhihu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_zhihu_toolbar);
        ButterKnife.inject(this);
        Toasts.registToasts(this);
        tbZhihu.setOverflowIcon(getResources().getDrawable(R.mipmap.ic_menu_more_overflow));
        tbZhihu.inflateMenu(R.menu.zhihubar_menu);
        tbZhihu.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                switch (itemId){
                    case R.id.msearch:
//                        Toast.makeText(ZhihuToolbarActivity.this,"Click Search",Toast.LENGTH_SHORT).show();
                        Toasts.shortShow("Click Search1");
                        break;
                    case R.id.mnotification:
//                        Toast.makeText(ZhihuToolbarActivity.this,"Click Notification",Toast.LENGTH_SHORT).show();
                        Toasts.shortShowNoRepet("Click Notification");
                         break;
                    case R.id.item1:
//                        Toast.makeText(ZhihuToolbarActivity.this,"Click Setting",Toast.LENGTH_SHORT).show();
                        Toasts.shortShowNoRepet("Click Setting");
                        break;
                    case R.id.item2:
//                        Toast.makeText(ZhihuToolbarActivity.this,"Click About",Toast.LENGTH_SHORT).show();
                        Toasts.shortShowNoRepet("Click About");
                        break;
                }
                return true;
            }
        });
    }
}
