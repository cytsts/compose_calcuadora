package com.example.compose_calcuadora

import org.junit.Assert.*

import org.junit.Test

class DivisibilidadeKtTest {

    @Test
    fun `GIVE 4,2 WHEN hasDivivible THEN return true`() {
        assertTrue( isDivivible(4,2))
    }

    @Test
    fun `GIVE 1,2 WHEN hasDivivible THEN return false`() {
        assertFalse( isDivivible(1,2))
    }

}


