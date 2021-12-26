package vortexydev.rocketbunch.utils.preferences.delegates

import android.content.SharedPreferences
import vortexydev.rocketbunch.utils.preferences.CommonPreferenceDelegate

class StringSetPreferenceDelegate(private val defValue: MutableSet<String>, name: String? = null) :
    CommonPreferenceDelegate<MutableSet<String>>(name) {
    override fun getValue(prefs: SharedPreferences, key: String): MutableSet<String> = prefs.getStringSet(key, defValue)!!
    override fun setValue(prefs: SharedPreferences, key: String, value: MutableSet<String>) {
        prefs.edit().putStringSet(key, value).apply()
    }
}