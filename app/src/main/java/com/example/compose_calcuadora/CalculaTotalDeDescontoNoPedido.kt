package com.example.compose_calcuadora

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
    var totalArroz = precoArroz * quantidadeArroz// multiplicar 20.00 por 0.9 ->(100-10)/100
    var totalBalinha = precoBalinha * quantidadeBalinha
    var totalPirulito = precoPirulito * quantidadePirulito

    var totalDescontoArroz = totalArroz * descontoArroz
    var totalDescontoBalinha = totalBalinha * descontoBalinha
    var totalDescontoPirulito = totalPirulito * descontoPirulito


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