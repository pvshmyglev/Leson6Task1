package ru.netology

data class AttachmentAudio(val audio: Audio) : Attachment{
    override val type: String = "audio"
}