package com.appcore.svmc.findecobus;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * Created by khactu on 2019-12-15.
 */
public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {
    public ViewModelProviderFactory(){

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return super.create(modelClass);
    }
}
