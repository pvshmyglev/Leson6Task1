package ru.netology

data class AttachmentVideo(val video: Video) : Attachment{
    override val type: String = "video"
}