package vortexydev.rocketbunch.extensions.dataStructures

import android.content.res.Resources

val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()