package com.android.designpatterndemo;

import com.android.designpatterndemo.Views.DPDAbstractFragment;
import com.android.designpatterndemo.Views.FailedFragment;
import com.android.designpatterndemo.Views.UndoneFragment;

import java.util.HashMap;

/**
 * Created by Administrator on 17-12-19 0019.
 */

public class FragmentManager {
    static HashMap mFragments;

    public static void RegisteView(String key, String clsname) {
        if (mFragments == null) {
            mFragments = new HashMap<String, String>();
        }
        mFragments.put(key, clsname);
    }

    public static DPDAbstractFragment getView(String key) {
        DPDAbstractFragment absf;
        String clsvalue = null;
        try {
            clsvalue = (String) mFragments.get(key);
            absf = (DPDAbstractFragment) Class.forName(clsvalue).newInstance();
        } catch (Exception e) {
            if (clsvalue != null) {
                absf = new UndoneFragment();
            } else {
                absf = new FailedFragment();
            }
        }

        return absf;
    }

}
