package com.wang.administrator.pricticedemo.translucentbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.wang.administrator.pricticedemo.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ColorTranslucentActivity extends AppCompatActivity {

    @InjectView(R.id.show)
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_color_translucent);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.show)
    public void onClick() {
        Toast.makeText(this,"toast", Toast.LENGTH_SHORT).show();
    }
}
