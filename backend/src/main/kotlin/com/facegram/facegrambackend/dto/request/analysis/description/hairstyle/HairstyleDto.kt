package com.facegram.facegrambackend.dto.request.analysis.description.hairstyle

import javax.persistence.Column

data class HairstyleDto(
    val type: String,
    val topLength: String,
    val sizeLength: String,
    val part: String? = null,
) {
}