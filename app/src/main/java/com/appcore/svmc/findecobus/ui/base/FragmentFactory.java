package com.appcore.svmc.findecobus.ui.base;

import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.appcore.svmc.findecobus.ui.map.MapFragment;

/**
 * Created by khactu on 2019-12-15.
 */
public class FragmentFactory {

    private static final String TAG = "FragmentFactory";

    public static final class SCENE {
        public static final String GREETING = "greeting";

        public static final String MAIN_MAP = "main_map";
    }

    public static Fragment create(String tag, FragmentManager fragmentManager, Bundle bundle) {
        Log.d(TAG, "createFragment: " + "tag - " + tag + "; fragmentManager - " + fragmentManager);
        if (fragmentManager == null || tag == null) return new Fragment();
        Fragment fragment = fragmentManager.findFragmentByTag(tag);
        if (fragment == null) return createFragmentByTag(tag, bundle);
        return fragment;
    }

    private static Fragment createFragmentByTag(String tag, Bundle bundle) {
        Log.d(TAG, "createFragmentByTag: " + tag);
        switch (tag) {
            case SCENE.GREETING:
//                return GreetingFragment.create(bundle);
                return null;
            case SCENE.MAIN_MAP:
                return MapFragment.create(bundle);
            default:
                Log.d(TAG, "Can't create fragment with tag: " + tag);
        }
        return null;
    }
}
