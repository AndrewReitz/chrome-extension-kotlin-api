package chrome

import chrome.action.Action
import chrome.runtime.Runtime
import chrome.storage.Storage
import chrome.tabs.Tabs
import org.w3c.fetch.RequestInit
import org.w3c.fetch.Response
import kotlin.js.Promise

/**
 * Normally we would use the window object but since background services don't have a window
 * we use this, which is a copy of kotlin's window.fetch method.
 */
external fun fetch(input: dynamic, init: RequestInit = definedExternally): Promise<Response>

@JsName("chrome")
external object Chrome {
    val runtime: Runtime
    val storage: Storage
    val action: Action
    val tabs: Tabs
}
