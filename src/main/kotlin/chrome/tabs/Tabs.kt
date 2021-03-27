package chrome.tabs

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/** https://developer.chrome.com/docs/extensions/reference/tabs */
external class Tabs {
    val onUpdated: OnUpdated
    @JsName("create")
    fun createAsync(createProperties: CreateProperties, callback: (tab: Tab) -> Unit)
    fun sendMessage(tabId: Number, message: Any?, options: Any? = definedExternally, responseCallback: () -> Unit = definedExternally)
}

// Doesn't do anything productive because IR compiler renames this but stops the compiler from complaining the name
// shadows another.
@get:JsName("tabStatusWrapper")
val Tab.status: TabStatus get() = TabStatus.valueOf(_status)

suspend fun Tabs.create(createProperties: CreateProperties): Tab = suspendCoroutine { c ->
    createAsync(createProperties) {
        c.resume(it)
    }
}
