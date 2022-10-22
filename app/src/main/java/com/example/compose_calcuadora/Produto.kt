package com.example.compose_calcuadora

data class Produto(
    val nome: String,
    val preco: Double,
    val quantidade: Double,
    val desconto: Double
) {
    fun valorTotalSemDesconto() = preco * quantidade
    fun valorDesconto() = valorTotalSemDesconto() * desconto
    fun valorTotal() = valorTotalSemDesconto() - valorDesconto()
}