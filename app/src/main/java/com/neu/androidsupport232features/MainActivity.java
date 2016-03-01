package com.neu.androidsupport232features;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButtonDay;
    private Button mButtonNight;
    private Button mButtonBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonDay = (Button) findViewById(R.id.buttonDay);
        mButtonNight = (Button) findViewById(R.id.buttonNight);
        mButtonBottomSheet = (Button) findViewById(R.id.buttonBottomSheet);

        mButtonDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                recreate();
            }
        });
        mButtonNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                recreate();
            }
        });
        mButtonBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetView.show(MainActivity.this);
            }
        });
    }
}
