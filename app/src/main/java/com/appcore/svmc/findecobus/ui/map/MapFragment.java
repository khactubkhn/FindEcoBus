package com.appcore.svmc.findecobus.ui.map;

import android.os.Bundle;

import com.appcore.svmc.findecobus.R;
import com.appcore.svmc.findecobus.databinding.FragmentMapBinding;
import com.appcore.svmc.findecobus.ui.base.BaseFragment;
import com.appcore.svmc.findecobus.BR;

/**
 * Created by khactu on 2019-12-16.
 */
public class MapFragment extends BaseFragment<FragmentMapBinding, MapViewModel> implements MapNavigator {

    public static MapFragment create(Bundle bundle){
        MapFragment mapFragment = new MapFragment();
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_map;
    }

    @Override
    protected Class<MapViewModel> getViewModelClass() {
        return MapViewModel.class;
    }
}
