package vortexydev.rocketbunch.utils.preferences.delegates

import android.content.SharedPreferences
import vortexydev.rocketbunch.utils.preferences.CommonPreferenceDelegate

class StringPreferenceDelegate(private val defValue: String, name: String? = null) : CommonPreferenceDelegate<String>(name) {
    override fun getValue(prefs: SharedPreferences, key: String) = prefs.getString(key, defValue)!!
    override fun setValue(prefs: SharedPreferences, key: String, value: String) {
        prefs.edit().putString(key, value).apply()
    }
}
