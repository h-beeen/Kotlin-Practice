package com.hbeeen.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SuperApplication

fun main(args: Array<String>) {
	runApplication<SuperApplication>(*args)
}