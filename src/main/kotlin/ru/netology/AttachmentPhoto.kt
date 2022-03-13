package ru.netology

data class AttachmentPhoto(val photo: Photo) : Attachment{
    override val type: String = "photo"
}