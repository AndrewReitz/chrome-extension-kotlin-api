package chrome.platform.storage

/** https://developer.chrome.com/docs/extensions/reference/storage/ */
external class Storage {
    val sync: StorageArea
    val local: StorageArea
}