package br.unisal

import java.util.*

fun main(){

    val name = "Erick"
    val email = "erickjsilva19@gmail.com"

    val pessoa = Pessoa(name, email)

    println(pessoa)

    println(pessoa.copy(name = "Erick Jose Silva Borges de Lima"))
    println(Pessoa(name))

    println(Pessoa.joinNameAndEmail(pessoa.name, pessoa?.email))



}