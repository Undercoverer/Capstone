package gay.extremist

import gay.extremist.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSockets()
    configureSerialization()
    configureDatabases()
    configureTemplating()
    configureHTTP()
    configureSecurity()
    configureRouting()
}
