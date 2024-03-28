package io.ahparhizgar.kapture.processor.annotation

annotation class Kontainer(
    val fileName: String = DEFAULT_FILE_NAME,
    val keyPrefix: String = ""
)

annotation class HiltKontainer
annotation class Kontains(val key: String)

const val DEFAULT_FILE_NAME = "data_store_kontainer"