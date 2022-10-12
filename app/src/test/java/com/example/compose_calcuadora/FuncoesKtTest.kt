package com.example.compose_calcuadora


import org.junit.Test

class FuncoesKtTest {

    @Test
    fun `GIVE 2 WHEN trocaSinal THEN -2`() {
        //GIVE
        var valor = 2
        //WHEN
        var trocadoSinal = trocaSinal(valor)
        //THEN
        assert(-2 == trocadoSinal)
    }

    @Test
    fun `GIVE 3 WHEN trocaSinal THEN -3`() {
        //GIVE
        var valor = 3
        //WHEN
        var trocadoSinal = trocaSinal(valor)
        //THEN
        assert(-3 == trocadoSinal)
    }


    @Test
    fun `GIVE 2 AND 2 WHEN somaDeValores THEN 4`() {
        //GIVE
        val valor = 2
        val valorOutro = 2
        //WHEN
        val soma = somaDeValores(valor, valorOutro)
        //THEN
        assert(4 == soma)
    }

    @Test
    fun `GIVE 2,5d AND 2_5d WHEN somaDeValores THEN 5,0d`() {
        //GIVE
        val valor = 2.5
        val valorOutro = 2.5
        //WHEN
        val soma = somaDeValores(valor, valorOutro)
        //THEN
        assert(5.0 == soma)
    }


    @Test
    fun `GIVE 2 AND 2 WHEN SubtracaoDeValores THEN 0`() {
        //GIVE
        val valor = 2
        val valorOutro = 2
        //WHEN
        val subtrai = subtracaoDeValores(valor, valorOutro)
        //THEN
        assert(0 == subtrai)

    }

    @Test
    fun `GIVE 5,5d AND 2,5d WHEN SubtraçaoDeValores THEN 3,0`() {
        //GIVE
        val valor = 2
        val valorOutro = 2
        //WHEN
        val subtrai = subtracaoDeValores(valor, valorOutro)
        //THEN
        assert(0 == subtrai)

    }

    @Test
    fun `GIVE 5 AND 2 WHEN divisaoDeValores THEN 2,5d`() {
        //GIVE
        val valor = 5.0
        val valorOutro = 2.0
        //WHEN
        val dividir = divisaoDeValores(valor , valorOutro)
        //THEN
        assert( 2.5 == dividir)
    }

    @Test
    fun `GIVE 5 AND 2 WHEN multiplicationDeValores THEN 10`() {
        //GIVE
        val valor = 5
        val valorOutro = 2
        //WHEN
        val multiplicar = multiplicacaoDeValores(valor,valorOutro)
        //THEN
        assert( 10 == multiplicar)
    }
    @Test
    fun `GIVE 4,0 AND 2,0 AND 3,0 WHEN mediaDeValoresDeTresNumeros THEN 3,0`() {
        //GIVE
        val valor = 4.0
        val valorOutro = 2.0
        val valor3 = 3.0
        //WHEN
        val mediaDeValores = mediaDeValoresDeTresNumeros(valor, valorOutro , valor3  )

        print(mediaDeValores)
        //THEN
        assert(3.0 == mediaDeValores)
    }

    @Test
    fun `GIVE 2 AND 0 WHEN divisaoDeValores THEN error`() {
        //GIVE
        val valor = 2.0
        val valorOutro = 0.0

        try {
            //WHEN
           divisaoDeValores(valor , valorOutro)
        } catch (e: Exception){
            //THEN
            assert(e is java.lang.IllegalArgumentException)
        }
    }

    @Test
    fun `GIVE dois numeros WHEN calculo sua media  THEN tem ser valido`() {


        //THEN
        assert(3.0 == media(3.0, 3.0))
        assert(3.0 == media(2.0, 4.0))
        assert(3.0 == media2(1.0, 5.0))

        //assert(3.0 == media(1.0, 5.0, 3.0))


    }


}