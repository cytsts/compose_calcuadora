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


fun calculaTotalDeDescontoNoPedido(arroz: Produto, balinha: Produto, pirulito: Produto): Double {
    println(arroz.valorDesconto())
    println(balinha.valorDesconto())
    println(pirulito.valorDesconto())
    return arroz.valorDesconto() + balinha.valorDesconto() + pirulito.valorDesconto()
}

fun calculaPercenturalDeDescontoPedido(
    arroz: Produto,
    balinha: Produto,
    pirulito: Produto
): Double {

    val descontoTotal = arroz.valorDesconto()
    +balinha.valorDesconto()
    +pirulito.valorDesconto()

    val valorTotalSemDesconto = arroz.valorTotalSemDesconto()
    +balinha.valorTotalSemDesconto()
    +pirulito.valorTotalSemDesconto()

    return (1 - (valorTotalSemDesconto - descontoTotal) / valorTotalSemDesconto) * 100
}

fun calculaValorTotalDoPedido(
    arroz: Produto,
    balinha: Produto,
    pirulito: Produto
): Double {

    return arroz.valorTotal()
    +balinha.valorTotal()
    +pirulito.valorTotal()
}

fun calculaTotalDeDescontoNoPedido(

    precoArroz: Double,
    quantidadeArroz: Double,
    descontoArroz: Double,

    precoBalinha: Double,
    quantidadeBalinha: Double,
    descontoBalinha: Double,

    precoPirulito: Double,
    quantidadePirulito: Double,
    descontoPirulito: Double,

    ): Double {
    val totalArroz = precoArroz * quantidadeArroz// multiplicar 20.00 por 0.9 ->(100-10)/100
    val totalBalinha = precoBalinha * quantidadeBalinha
    val totalPirulito = precoPirulito * quantidadePirulito

    val totalDescontoArroz = totalArroz * descontoArroz
    val totalDescontoBalinha = totalBalinha * descontoBalinha
    val totalDescontoPirulito = totalPirulito * descontoPirulito


    // o valor com 10% de desconto  = mutiplicar por 0.9  -> (100-10)/100
    // o valor com 10% de acrescimo = multiplicar por 1.1 -> (100+10)/100

//    Arroz
//
//    (preço: 20.00,quantidade = 10 , desconto = 10%)
//
//    Balinha
//
//    ( preço: 5.00, quantidade = 10 , desconto = 50%)
//
//    Pirulito
//
//    ( preço : 0.05 , quantidade = 10 , desconto = 50%)

    println(totalDescontoArroz)
    println(totalDescontoBalinha)
    println(totalDescontoPirulito)
    return totalDescontoArroz + totalDescontoBalinha + totalDescontoPirulito
}


fun calculaPercenturalDeDescontoPedido(
    precoArroz: Double,
    quantidadeArroz: Double,
    descontoArroz: Double,

    precoBalinha: Double,
    quantidadeBalinha: Double,
    descontoBalinha: Double,

    precoPirulito: Double,
    quantidadePirulito: Double,
    descontoPirulito: Double,
): Double {
    /*TODO*/
    return 0.0
}

fun calculaValorTotalDoPedido(
    precoArroz: Double,
    quantidadeArroz: Double,
    descontoArroz: Double,

    precoBalinha: Double,
    quantidadeBalinha: Double,
    descontoBalinha: Double,

    precoPirulito: Double,
    quantidadePirulito: Double,
    descontoPirulito: Double,

    ): Double {
    /*TODO*/
    return 0.0
}