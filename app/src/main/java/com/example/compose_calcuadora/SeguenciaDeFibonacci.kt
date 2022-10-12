package com.example.compose_calcuadora

var contador = 0

fun seguenciaDeFibonacci(posicao: Int): Int {

    contador+=1

    if(posicao > 15) return throw Exception("Ai não irmão")

    if(posicao <= 0) return 0

    if(posicao == 1) return 1

    if(posicao == 2) return 1

    val element1 = seguenciaDeFibonacci(posicao - 1)

    val element2 = seguenciaDeFibonacci(posicao - 2)

    return element1 + element2
}