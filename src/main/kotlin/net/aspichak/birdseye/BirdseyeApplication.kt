package net.aspichak.birdseye

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BirdseyeApplication

fun main(args: Array<String>) {
	runApplication<BirdseyeApplication>(*args)
}
