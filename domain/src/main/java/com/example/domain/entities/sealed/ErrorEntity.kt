package com.example.domain.entities.sealed

sealed class ErrorEntity {

    object Network : ErrorEntity()
    object ServiceUnavailable : ErrorEntity()
    object BadRequest : ErrorEntity()
    object Unknown : ErrorEntity()
}