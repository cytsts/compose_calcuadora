package com.example.compose_calcuadora

import org.junit.Assert.*

import org.junit.Test

class SeguenciaDeFibonacciKtTest {

    /*
    *  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584
    *
    * */
    @Test
    fun seguenciaDeFibonacci() {
        contador = 0
        val valor  = seguenciaDeFibonacci(15)
        println("O valor da sequencia é: $valor ")
        assertTrue(valor == 610)
        println("funcão executada: $contador")
    }
}