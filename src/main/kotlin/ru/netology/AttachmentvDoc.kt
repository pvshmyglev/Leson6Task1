package ru.netology

data class AttachmentvDoc(val doc: Doc) : Attachment{
    override val type: String = "doc"
}