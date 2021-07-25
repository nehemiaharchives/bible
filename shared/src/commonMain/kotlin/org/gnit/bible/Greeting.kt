package org.gnit.bible

class Greeting {
    fun greeting(): String {
        return "In the beginning God created the heaven and the earth. - KJV in ${Platform().platform}!"
    }
}