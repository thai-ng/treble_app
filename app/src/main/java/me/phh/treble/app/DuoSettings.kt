package me.phh.treble.app

import android.os.Bundle
import android.os.SystemProperties

object DuoSettings : Settings {
    val disableHingeGap = "key_disable_hinge_gap"

    override fun enabled() = (SystemProperties.get("ro.hardware", "N/A") == "surfaceduo" || SystemProperties.get("ro.hardware", "N/A") == "surfaceduo2")
}

class DuoSettingsFragment : SettingsFragment() {
    override val preferencesResId = R.xml.pref_duo

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        android.util.Log.d("PHH", "Loading duo fragment ${DuoSettings.enabled()}")
    }
}
