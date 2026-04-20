package org.techveira

///Atividade 1: Criar uma nova função pra retornar uma string
///Atividade 2: Chamar a função na main e printar
///Atividade 3: Criar uma nova função que tenha alguns parametros
///Atividade 4: Fazer a função receber um valor padrão pra não quebrar

data class animais(var nome: String, var idade: Int, var tipo: String, var raca: String = "Viralata") {
//    override fun toString(): String {
//        return "Nome: ${nome}, Idade: ${idade} é um ${tipo} de raça: ${raca}"
//    }
}

fun main() {
    println("Hello world!\n\n")
//    println(chamarAnimais() + "\n\n")

    val animalUm = animais("Poppy", 8, "Cachorro", "Shitzu")
    val animalDois = animais("Tiffany", 4, "Cachorro", "Chihuahua")
    val animalTres = animais("Manuel", 8, "Gato")

    chamarAnimaisNew(animalUm)
    chamarAnimaisNew(animalDois)
    chamarAnimaisNew(animalTres)
}

fun chamarAnimais(): String {
    val animalUm = animais("Poppy", 8, "Cachorro", "Shitzu")
    val animalDois = animais("Tiffany", 4, "Cachorro", "Chihuahua")
    val animalTres = animais("Manuel", 8, "Gato")
    val conjuntoAnimais = "Meus animais são: \n${animalUm} \n${animalDois} \n${animalTres}"
    return conjuntoAnimais
}

fun chamarAnimaisNew(animais: animais) {
    println("Nome: ${animais.nome}, Idade: ${animais.idade} é um ${animais.tipo} de raça: ${animais.raca}")
}


