package com.appcore.svmc.findecobus.ui.main;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.appcore.svmc.findecobus.BR;
import com.appcore.svmc.findecobus.R;
import com.appcore.svmc.findecobus.databinding.ActivityMainBinding;
import com.appcore.svmc.findecobus.ui.base.BaseActivity;
import com.appcore.svmc.findecobus.ui.base.FragmentFactory;

/**
 * Created by khactu on 2019-12-15.
 */
public class MainActivity extends BaseActivity<ActivityMainBinding, MainActivityViewModel> implements MainActivityNavigator {

    private int mMainFragmentContainer;
    private FragmentManager mFragmentManager = getSupportFragmentManager();

    public static Intent newIntent(Context context){
        return new Intent(context, MainActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return  BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewModel().setmNavigator(this);
        mMainFragmentContainer = getViewDataBinding().containerMain.getId();

        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(mMainFragmentContainer, FragmentFactory.create(
                FragmentFactory.SCENE.MAIN_MAP, mFragmentManager, null
        ));

        mFragmentTransaction.commit();
    }

    @Override
    protected Class<MainActivityViewModel> getViewModelClass() {
        return MainActivityViewModel.class;
    }
}