fun reverseWords(s: String): String {
    val words = ArrayList<String>()
    val currentWord = StringBuilder()

    s.forEach { char ->
        if (char != ' ') {
            currentWord.append(char)
        } else if (currentWord.isNotEmpty()) {
            words.add(currentWord.toString())
            currentWord.clear()
        }
    }

    if (currentWord.isNotEmpty()) {
        words.add(currentWord.toString())
    }

    return words.reversed().joinToString(" ")
}
