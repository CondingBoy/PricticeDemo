package com.wang.administrator.pricticedemo.mdwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.wang.administrator.pricticedemo.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ToolbarActivity extends AppCompatActivity {

    @InjectView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_toolbar);
        ButterKnife.inject(this);
//        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
//        toolbar.setLogo(R.mipmap.ic_launcher);
//        toolbar.setTitle("Title");
//        toolbar.setTitleTextColor(Color.DKGRAY);
//        toolbar.setSubtitle("Subtitle");
//        toolbar.setSubtitleTextColor(Color.WHITE);
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setOverflowIcon(getResources().getDrawable(R.mipmap.ic_menu_more_overflow));
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                switch (itemId){
                    case R.id.action_search:
                        Toast.makeText(getApplicationContext(),"Search",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_clock:
                        Toast.makeText(getApplicationContext(),"Notification",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_1:
                        Toast.makeText(getApplicationContext(),"Item1",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_2:
                        Toast.makeText(getApplicationContext(),"Item2",Toast.LENGTH_SHORT).show();
                        break;


                }
                return true;
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Navigation",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
