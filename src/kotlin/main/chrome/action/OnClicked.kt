package chrome.platform.action

import chrome.platform.tabs.Tab

/** https://developer.chrome.com/docs/extensions/reference/action/#event-onClicked */
external class OnClicked {
    fun addListener(listener: (tab: Tab) -> Unit)
}