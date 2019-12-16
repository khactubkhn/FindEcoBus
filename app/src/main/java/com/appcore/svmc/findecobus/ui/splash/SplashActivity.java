package com.appcore.svmc.findecobus.ui.splash;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.appcore.svmc.findecobus.ui.main.MainActivity;

/**
 * Created by khactu on 2019-12-15.
 */
public class SplashActivity extends AppCompatActivity {

    private static final String TAG = "SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);

        final Intent mainActivityIntent = MainActivity.newIntent(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(
                        mainActivityIntent
                );
            }
        }, 700);
    }
}
