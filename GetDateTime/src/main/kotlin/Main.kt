import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


private fun dataAndTime(): String = LocalDateTime.now().format(
    DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
)