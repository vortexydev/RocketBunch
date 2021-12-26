package vortexydev.rocketbunch.extensions.orbit

import androidx.viewbinding.ViewBinding
import vortexydev.rocketbunch.base.activity.OrbitActivity
import vortexydev.rocketbunch.base.fragment.orbit.OrbitFragment

fun <BINDING : ViewBinding, STATE : Any, SIDE_EFFECT : Any> OrbitActivity<BINDING, STATE, SIDE_EFFECT>.binding(block: BINDING.() -> Unit) {
    binding?.apply(block)
}

fun <STATE : Any, SIDE_EFFECT : Any, BINDING : ViewBinding> OrbitFragment<STATE, SIDE_EFFECT, BINDING>.binding(block: BINDING.() -> Unit) {
    binding?.apply(block)
}