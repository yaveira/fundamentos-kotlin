package org.techveira

class carro(var cor:String, val anoFabricacao: Int, val dono: dono)

class dono(var nome:String, var idade: Int)

fun main() {
    var carro = carro("Branco", 2021, dono("Yago", 31))

    println(carro.cor)
    println(carro.anoFabricacao)

    carro.cor = "Preto"
    println(carro.cor)

    println(carro.dono.nome)
    println("Nome do dono: " + carro.dono.idade)
}