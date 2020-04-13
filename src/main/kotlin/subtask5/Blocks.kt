package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        when(blockB){
            Int::class -> {
                var result = 0
                for (item in blockA) {
                    if (item is Int)
                        result += item
                }
                return result
            }
            String::class -> {
                var result = ""
                for (item in blockA) {
                    if (item is String)
                        result += item
                }
                return result
            }
            else -> {
                var result = LocalDate.now()
                var check = false
                for (item in blockA) {
                    if (item is LocalDate){
                        if ((!check) || item>result){
                            check = true
                            result = item
                        }
                    }
                }
                return result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
    }
}
