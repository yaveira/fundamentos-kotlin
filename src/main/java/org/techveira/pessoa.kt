package org.techveira

class pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe pessoa. Nome: ${nome}, Idade: ${idade}"
    }
}

fun main() {
    val yago = pessoa("Yago", 31)
    println(yago)
}