package com.aazamn.customswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.aazamn.customswitch.widget.switchView.SwitchView;

public class MainActivity extends AppCompatActivity {

    SwitchView switchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchView = findViewById(R.id.switchView);

        //switchView.setCheck(false);
        switchView.setOnCheckedChangeListener(new SwitchView.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchView switchView, boolean isChecked) {
                Log.i("Switch View", String.valueOf(isChecked));
            }
        });

    }


}
