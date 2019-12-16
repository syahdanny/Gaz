package com.example.gaz.fragment;
import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import java.util.prefs.PreferenceChangeEvent;

import com.example.gaz.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
