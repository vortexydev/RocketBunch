package vortexydev.rocketbunch.base.fragment.orbit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import vortexydev.rocketbunch.extensions.containerHost.observe

abstract class OrbitFragment<STATE : Any, SIDE_EFFECT : Any, BINDING : ViewBinding>(
    private val inflateBinding: (LayoutInflater, ViewGroup?, Boolean) -> BINDING
) : Fragment() {

    var binding: BINDING? = null
        private set

    abstract val viewModel: OrbitViewModel<STATE, SIDE_EFFECT>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflateBinding(inflater, container, false).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindMviToViewModel()
    }

    private fun bindMviToViewModel() = with(viewModel) {
        observe(viewLifecycleOwner, state = ::renderState, sideEffect = ::handleSideEffect)
    }

    protected abstract fun renderState(state: STATE)

    protected abstract fun handleSideEffect(sideEffect: SIDE_EFFECT)
}