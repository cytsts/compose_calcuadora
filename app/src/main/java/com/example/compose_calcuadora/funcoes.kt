package com.example.compose_calcuadora

fun trocaSinal(valor: Int): Int {
    return valor * (-1)
}

fun somaDeValores(valor: Int, outroValor: Int): Int {
    return valor + outroValor
}

fun somaDeValores(valor: Double, outroValor: Double): Double {
    return valor + outroValor
}


fun soma(x: Double, y: Double) = x.sum(y)

fun Double.sum(valor: Double) = this + valor

fun subtracaoDeValores(valor: Int, outroValor: Int): Int {
    return valor - outroValor

}

fun subtracaoDeValores(valor: Double, outroValor: Double): Double {
    return valor - outroValor
}

fun divisaoDeValores(valor: Double, outroValor: Double): Double {
    if (outroValor == 0.0) {
        throw IllegalArgumentException("Não dividiras por Zero!!")
    }

    return (valor / outroValor).toDouble()

}

fun multiplicacaoDeValores(valor: Int, outroValor: Int): Int {
    return valor * outroValor

}

fun mediaDeValoresDeDoisNumeros(valor: Int, outroValor: Int): Double {

    return ((valor + outroValor) / 2).toDouble()

}

fun mediaDeValoresDeTresNumeros(valor: Double, outroValor: Double, valor3: Double): Double {

    return ((valor + outroValor + valor3) / 3).toDouble()
}


fun media(vararg valores: Double): Double {
    var soma = 0.0
    valores.forEach { valor ->
        soma += valor
    }
    return soma / valores.size
}


fun media2(vararg valores: Double): Double {
    var soma = 0.0
    for (valor in valores){
        soma += valor
    }
    return soma / valores.size
}
/*
  Uma função que some dois numeros
  Uma função que subtrais dois numeros
  Uma função que divida dois numeros
  Uma função que multiplique dois numeros
  Uma função que calcule a media de dois numeros
  Uma funcção que calcule a media de 3 numeros
  Todas com teste

 */