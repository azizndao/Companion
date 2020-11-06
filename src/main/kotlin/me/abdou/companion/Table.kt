package me.abdou.companion

import kotlinx.datetime.Clock
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties


abstract class Table {
    open var id: Long = 0
    open var createdAt: Long = Clock.System.now().toEpochMilliseconds()
    open var updatedAt: Long? = null

    companion object {
        fun <T : Table> build(kClass: KClass<out T>) {
            println(kClass.simpleName)
            kClass.memberProperties.forEach {
                println(it.name)
            }
        }
    }
}
