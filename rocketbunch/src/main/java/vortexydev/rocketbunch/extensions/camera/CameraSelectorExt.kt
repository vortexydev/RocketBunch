package vortexydev.rocketbunch.extensions.camera

import androidx.camera.core.CameraSelector

fun CameraSelector.switchLens(): CameraSelector {
    return if (this == CameraSelector.DEFAULT_FRONT_CAMERA)
        CameraSelector.DEFAULT_BACK_CAMERA
    else CameraSelector.DEFAULT_FRONT_CAMERA
}