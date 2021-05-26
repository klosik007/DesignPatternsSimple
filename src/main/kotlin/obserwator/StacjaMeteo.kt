package obserwator

import DanePogodowe

fun main(args: Array<String>) {
   val danePogodowe: DanePogodowe = DanePogodowe()

    val warunkiBiezace: WarunkiBiezaceWyswietl = WarunkiBiezaceWyswietl(danePogodowe)

    danePogodowe.ustawOdczyty(25.5f, 65.0f, 1011.1f)
    danePogodowe.ustawOdczyty(27.5f, 65.0f, 1044.1f)
}