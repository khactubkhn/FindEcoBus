package com.appcore.svmc.findecobus.ui.base;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by khactu on 2019-12-15.
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView){
        super(itemView);
    }

    public abstract void onBind(int position);
}
