package com.example.gateway.handlers

import com.example.domain.entities.sealed.ErrorEntity
import com.example.domain.handlers.ErrorHandler
import retrofit2.HttpException
import java.io.IOException
import java.net.HttpURLConnection

class ErrorHandlerImpl : ErrorHandler {

    override fun getError(throwable: Throwable): ErrorEntity {
        return when (throwable) {
            is IOException -> return ErrorEntity.Network
            is HttpException -> {
                when (throwable.code()) {
                    HttpURLConnection.HTTP_BAD_GATEWAY -> ErrorEntity.ServiceUnavailable
                    HttpURLConnection.HTTP_NOT_FOUND -> ErrorEntity.ServiceUnavailable
                    HttpURLConnection.HTTP_BAD_REQUEST -> ErrorEntity.BadRequest
                    else -> ErrorEntity.Unknown
                }
            }
            else -> ErrorEntity.Unknown
        }
    }
}