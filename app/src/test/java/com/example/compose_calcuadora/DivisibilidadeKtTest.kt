package com.example.compose_calcuadora

import org.junit.Assert.*

import org.junit.Test

class DivisibilidadeKtTest {

    @Test
    fun `GIVE 4,2 WHEN hasDivivible THEN return true`() {
        assertTrue(  eDivisivelporDois(4))
        assertFalse (eDivisivelporDois(3))
    }

    @Test
    fun `GIVE 1,2 WHEN hasDivivible THEN return false`() {
        assertFalse( eDivisivelporDois(1))
        assertTrue( eDivisivelporDois(6))
    }
    @Test
    fun `GIVE 2,3 WHEN hasDivivible THEN return false`() {
        assertFalse( eDivisivelporTres( 2))
        assertTrue( eDivisivelporTres(6))

    }



    @Test
    fun `GIVE 3,5 WHEN hasDivivible THEN return false`() {
        assertFalse( eDivisivelporCinco( 3))
        assertTrue( eDivisivelporCinco(15))

    }


    @Test
    fun `GIVE 4,7 WHEN hasDivivible THEN return false`() {
        assertFalse( eDivisivelporSete(4))
        assertTrue( eDivisivelporSete(14))
    }

    @Test
    fun `GIVE 5,11 WHEN hasDivivible THEN return false`() {
        assertFalse (eDivisivelporOnze(5))
        assertTrue( eDivisivelporOnze(22))
    }

    @Test
    fun `GIVE 1,6 WHEN hasDivivible THEN return false`() {
        assertFalse(  eDivisivelporSeis(1))
        assertTrue( eDivisivelporSeis(24))
    }

    @Test
    fun `GIVE 2,10 WHEN hasDivivible THEN return false`() {
        assertFalse(  eDivisivelporDez(2))
        assertTrue( eDivisivelporDez(100))
    }
    @Test
    fun `GIVE 3,4 WHEN hasDivivible THEN return false`() {
        assertFalse(  eDivisivelporQuatro(3))
        assertTrue( eDivisivelporQuatro(24))
    }

    @Test
    fun `GIVE 4,9 WHEN hasDivivible THEN return false`() {
        assertFalse(  eDivisivelporNove(4))
        assertTrue( eDivisivelporNove(27))
    }
}


