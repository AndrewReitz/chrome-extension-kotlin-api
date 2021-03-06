package chrome.runtime

/** https://developer.chrome.com/docs/extensions/reference/runtime/ */
external interface Runtime {
    val onInstalled: OnInstalled
    val onMessage: OnMessage
    fun sendMessage(message: Any, callback: (response: Any?) -> Unit = definedExternally)
    @JsName("getURL")
    fun getUrl(path: String): String
}
