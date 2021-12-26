package vortexydev.rocketbunch.extensions.view

import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.annotation.MenuRes

fun PopupMenu.show(@MenuRes menuId: Int, onItemClicked: (MenuItem) -> Unit) {
    menuInflater.inflate(menuId, menu)
    setOnMenuItemClickListener {
        onItemClicked(it)
        true
    }
    show()
}

fun View.showPopupMenu(@MenuRes menuId: Int, onItemClicked: (MenuItem) -> Unit) =
    PopupMenu(context, this).show(menuId, onItemClicked)

fun View.showPopupMenu(
    items: List<String>,
    onItemClicked: (String) -> Unit
) = PopupMenu(context, this).apply {
    items.forEach {
        menu.add(it)
    }

    setOnMenuItemClickListener {
        onItemClicked(it.title.toString())
        true
    }
}.show()

fun View.showPopupMenu(
    vararg items: String,
    onItemClicked: (String) -> Unit
) = showPopupMenu(items.toList(), onItemClicked)