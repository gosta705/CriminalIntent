package com.example.tanya.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by tanya on 16.03.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
