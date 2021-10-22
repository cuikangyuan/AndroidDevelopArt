package com.ryg.bitmapRegionDecoder;


import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;

import androidx.annotation.RequiresApi;

import com.ryg.chapter_2.R;

import java.io.File;

public class MainActivity extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BigImageView bigImageView = findViewById(R.id.big_image_view);
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        bigImageView.setFilePath(absolutePath + "/test_pic.jpeg");
        //Log.d("MainActivity", absolutePath);

    }
}