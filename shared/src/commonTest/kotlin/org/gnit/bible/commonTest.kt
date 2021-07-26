package org.gnit.bible

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("God"), "Check 'God' is mentioned")
    }

    @Test
    fun testMaxChapter() {

        intArrayOf(50, 40, 27, 36, 34, //Pentateuch
            24, 21, 4, 31, 24, 22, 25, 29, 36, 10, 13, 10, 42, //History
            150, 31, 12, 8, //Wisdom
            66, 52, 5, 48, 12, 14, 3, 9, 1, 4, 7, 3, 3, 3, 2, 14, 4, //Prophets
            28, 16, 24, 21, 28, //Gospels & Acts
            16, 16, 13, 6, 6, 4, 4, 5, 3, 6, 4, 3, 1, 13, 5, 5, 3, 5, 1, 1, 1, //Letters
            22 ) //Revelation
            .forEachIndexed { index, expectedMaxChapters ->
            val book = index + 1
            val actual = Chapters.maxChapter(book)
            assertEquals(expectedMaxChapters, actual, "book $book chapters")
        }
    }
}