package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val newMonth = if (month.length == 1) "0$month" else month
            val language = Locale("ru", "RU")
            val pattern = "dd MMMM, EEEE"
            val date = LocalDate.parse("$year-$newMonth-$day")
            date.format(DateTimeFormatter.ofPattern(pattern, language))
        } catch (e: Exception){
            "Такого дня не существует"
        }
    }
}
