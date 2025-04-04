package com.russianroadman.chatix_core.dto

import java.util.*

data class MessageDTO(
    val id: UUID?,
    val userId: UUID,
    val roomId: UUID,
    val roomCode: String,
    val text: String,
    val isDuringCall: Boolean
)
