package com.appcore.svmc.findecobus.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.appcore.svmc.findecobus.R;
/**
 * Created by khactu on 2019-12-15.
 */
public class MainActivity extends AppCompatActivity {

    public static Intent newIntent(Context context){
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}