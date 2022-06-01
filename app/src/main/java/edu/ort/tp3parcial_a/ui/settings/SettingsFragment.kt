package edu.ort.tp3parcial_a.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import edu.ort.tp3parcial_a.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}