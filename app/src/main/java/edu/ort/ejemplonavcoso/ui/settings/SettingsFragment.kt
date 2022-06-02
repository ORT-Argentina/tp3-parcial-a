package edu.ort.ejemplonavcoso.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import edu.ort.ejemplonavcoso.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}