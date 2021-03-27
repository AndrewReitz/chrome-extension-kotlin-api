package chrome.platform.tabs

/** https://developer.chrome.com/docs/extensions/reference/tabs/#onUpdated */
external class ChangeInfo {
    val audible: Boolean?
    val autoDiscardable: Boolean?
    val discarded: Boolean?
    val favIconUrl: String?
    val groupId: Number?
    val mutedInfo: MutedInfo
    val pinned: Boolean?

    @JsName("status")
    internal val _status: String?

    /** https://developer.chrome.com/docs/extensions/reference/tabs/#type-TabStatus */
    val status: TabStatus?
    val title: String?
    val url: String?
}

val ChangeInfo.status: TabStatus? get() = if (_status != null) TabStatus.valueOf(_status) else null
