package com.example.sqlite1.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.example.sqlcoba1.R;
import com.example.sqlite1.R;

public class SettingFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preference, rootKey);
    }
}
