package jpabook.jpashop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpashopApplication

fun main(args: Array<String>) {
	val runApplication = runApplication<JpashopApplication>(*args)
}
