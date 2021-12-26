package vortexydev.rocketbunch.utils.preferences.delegates

import android.content.SharedPreferences
import vortexydev.rocketbunch.utils.preferences.CommonPreferenceDelegate

class BooleanPreferenceDelegate(private val defValue: Boolean, name: String? = null) : CommonPreferenceDelegate<Boolean>(name) {
    override fun getValue(prefs: SharedPreferences, key: String) = prefs.getBoolean(key, defValue)
    override fun setValue(prefs: SharedPreferences, key: String, value: Boolean) {
        prefs.edit().putBoolean(key, value).apply()
    }
}