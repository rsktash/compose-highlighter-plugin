package uz.rsteam.highlighting

import uz.rsteam.ChangeNotes
import uz.rsteam.Release
import uz.rsteam.SemVer
import java.time.LocalDate
import java.time.Month

val pluginChangeNotes = ChangeNotes(
    releases = listOf(
        Release(
            version = SemVer(1, 0, 2),
            date = LocalDate.of(2023, Month.JULY, 24),
            notes = listOf("Author website")
        ),
    )
)
