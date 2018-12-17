package net.flyingalpaca.copier

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CopierApplication

fun main(args: Array<String>) {
    runApplication<CopierApplication>(*args)
}
