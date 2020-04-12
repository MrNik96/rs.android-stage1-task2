package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val hourInt: Int = hour.toInt()
        val minuteInt: Int = minute.toInt()

        val numbs = arrayOf("zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine")

        return when(minuteInt){
            0 -> "${numbs[hourInt]} o' clock"
            15 -> "quarter past ${numbs[hourInt]}"
            30 -> "half past ${numbs[hourInt]}"
            45 -> "quarter to ${numbs[hourInt + 1]}"
            in 1..29 ->"${numbs[minuteInt]} minutes past ${numbs[hourInt]}"
            in 31..59 ->"${numbs[60 - minuteInt]} minutes to ${numbs[hourInt + 1]}"
            else -> ""
        }
    }

}
