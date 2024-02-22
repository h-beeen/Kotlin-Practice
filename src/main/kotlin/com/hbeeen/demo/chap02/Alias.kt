package com.hbeeen.demo.chap02

import com.hbeeen.demo.example.Person as User

fun main(args: Array<String>) {
    val person = User("고길동", 30)
    println(person.name)
    println(person.age)
}
