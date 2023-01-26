class TruncateSentence {
    fun truncateSentence(s: String, k: Int): String {
        var count = 0
        return s.takeWhile {
            if (it == ' ') count++
            count != k
        }.trim()
    }
}