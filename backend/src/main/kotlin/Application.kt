package com.laioffer

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import kotlinx.coroutines.delay
import kotlinx.serialization.json.Json
import kotlin.random.Random
import kotlin.random.nextLong

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json(Json {
            prettyPrint = true
            isLenient = true
            ignoreUnknownKeys = true
        })
    }

    intercept(ApplicationCallPipeline.Setup) {
        delay(Random.nextLong(300, 501))
    }

    configureRouting()
}
