package com.example.compose_calcuadora


fun isDivivible(a: Int, b: Int) = a % b == 0

fun eDivisivelporDois(valor: Int) = isDivivible(valor, 2)

fun eDivisivelporTres(valor: Int) = isDivivible(valor, 3)

fun eDivisivelporCinco(valor: Int) = isDivivible(valor, 5)

fun eDivisivelporSete(valor: Int) = isDivivible(valor, 7)

fun eDivisivelporOnze(valor: Int) = isDivivible(valor, 11)

fun eDivisivelporSeis(valor: Int) = isDivivible(valor, 6)

fun eDivisivelporDez(valor: Int) = isDivivible(valor, 10)

fun eDivisivelporQuatro(valor: Int) = isDivivible(valor, 4)

fun eDivisivelporNove(valor: Int) = isDivivible(valor, 9)


/*
  Funções que verificam divisibilidade, deve retornar um booleano
    1. por 2
    2. por 3
    3. por 5
    4. por 7
    5. por 11
    Todas com teste

    Depois funções que verifiquem divisibilidade por;
    1. por 6
    2. por 10
    3. por 4
    4. por 9

    Todas com teste

  Todas com teste

 */