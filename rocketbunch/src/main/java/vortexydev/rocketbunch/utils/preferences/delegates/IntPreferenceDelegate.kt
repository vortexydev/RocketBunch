package vortexydev.rocketbunch.utils.preferences.delegates

import android.content.SharedPreferences
import vortexydev.rocketbunch.utils.preferences.CommonPreferenceDelegate

class IntPreferenceDelegate(private val defValue: Int, name: String? = null) : CommonPreferenceDelegate<Int>(name) {
    override fun getValue(prefs: SharedPreferences, key: String) = prefs.getInt(key, defValue)
    override fun setValue(prefs: SharedPreferences, key: String, value: Int) {
        prefs.edit().putInt(key, value).apply()
    }
}