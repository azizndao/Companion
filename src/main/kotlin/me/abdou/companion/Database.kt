package me.abdou.companion

import java.sql.Connection
import java.sql.DriverManager
import kotlin.reflect.KClass

object Database {
    private lateinit var connection: Connection

    fun connect(user: User): Database {
        val (dbUrl: String, userName: String?, password: String?) = user
        connection = DriverManager.getConnection(dbUrl, userName, password)
        return this
    }

    fun <T : Table> createTable(arrayOf: Array<KClass<out T>>) {

    }

    data class User(val dbUrl: String, val userName: String? = null, val password: String? = null) {
        val dbType get() = dbUrl.split(":")[1]
    }
}
