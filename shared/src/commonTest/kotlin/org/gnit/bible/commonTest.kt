package org.gnit.bible

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("God"), "Check 'God' is mentioned")
    }
}