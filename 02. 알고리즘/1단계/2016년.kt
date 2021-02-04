import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val year = 2016

    val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.KOREA)
    val pa: Date = simpleDateFormat.parse("$year/1/1")
    print( pa.toString().substring(0,3).toUpperCase())
}