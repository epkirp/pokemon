package com.example.domain.handlers

import com.example.domain.entities.sealed.ErrorEntity

interface ErrorHandler {

    fun getError(throwable: Throwable): ErrorEntity
}