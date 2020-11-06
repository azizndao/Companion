package me.abdou.companion

import org.junit.Test

class DatabaseTest {

    @Test
    fun `connection should work`() {
        Database
            .connect(Database.User(dbUrl = "jdbc:sqlite:demo.sqlite"))
            .createTable(arrayOf(User::class, Post::class))
        var aziz = User("Abdou Aziz", "Ndao")
        Table.build(User::class)
    }
}

class User(val firstName: String, var lastName: String) : Table()

class Post : Table()
