package obserwator

interface Podmiot {
    fun zarejestrujObserwatora(obserwator: Obserwator)
    fun usunObserwatora(obserwator: Obserwator)
    fun powiadomObserwatorow()
}