package com.example.compose_calcuadora

import org.junit.Assert.*

import org.junit.Test

class CalculaTotalDeDescontoNoPedidoKtTest {

    @Test
    fun testaPedido() {

        var desconto = calculaTotalDeDescontoNoPedido(
            precoArroz = 20.00,
            descontoArroz = 0.1,
            quantidadeArroz = 10.0,
            precoBalinha = 5.00,
            descontoBalinha = 0.5,
            quantidadeBalinha = 10.0,
            precoPirulito = 0.05,
            descontoPirulito = 0.5,
            quantidadePirulito = 10.0

        )
        println(desconto)
        assertTrue(desconto == 45.25)
    }

}