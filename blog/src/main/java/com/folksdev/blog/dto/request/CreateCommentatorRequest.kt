package com.folksdev.blog.dto.request

import java.time.LocalDate
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.PastOrPresent

data class CreateCommentatorRequest(

    @field:NotBlank
    val commentator_name: String,

    @field:NotNull
    @field:PastOrPresent
    val auth_date: LocalDate,

)