package ru.netology

data class AttachmentLink(val link: Link) : Attachment{
    override val type: String = "link"
}