package chrome.platform.action

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/** https://developer.chrome.com/docs/extensions/reference/action */
external class Action {
    val onClicked: OnClicked
    @JsName("setBadgeText")
    internal fun _setBadgeText(details: dynamic, callback: () -> Unit)
}

suspend fun Action.setBadgeText(text: String? = "", tabId: Number? = undefined) = suspendCoroutine<Unit> { c ->
    val o = js("({})")
    o["text"] = text
    o["tabId"] = tabId
    _setBadgeText(o) { c.resume(Unit) }
}
