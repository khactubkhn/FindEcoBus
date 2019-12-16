package com.appcore.svmc.findecobus.ui.base;

import androidx.lifecycle.ViewModel;

import java.lang.ref.WeakReference;

/**
 * Created by khactu on 2019-12-15.
 */
public class BaseViewModel<N> extends ViewModel {
    private WeakReference<N> mNavigator;
    public BaseViewModel(){

    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

    public N getNavigator(){
        return mNavigator.get();
    }

    public void setmNavigator(N navigator){
        this.mNavigator = new WeakReference<>(navigator);
    }
}
