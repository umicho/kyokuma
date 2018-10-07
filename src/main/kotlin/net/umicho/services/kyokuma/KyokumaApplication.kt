package net.umicho.services.kyokuma

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KyokumaApplication

fun main(args: Array<String>) {
    runApplication<KyokumaApplication>(*args)
}
