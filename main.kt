class Solution {
    fun isPalindrome(s: String): Boolean {
        var straight = s.toCharArray()
        for (i in straight.indices) {
            if (!straight[i].isLetterOrDigit()) {
                straight[i] = ' '
            }
            else {straight[i] = straight[i].lowercaseChar()}
        }

        straight = String(straight).replace(" ", "").toCharArray()
        var reverse = CharArray(straight.size)
        for (i in straight.indices) {
            reverse[i] = straight[straight.size-1-i]
        }

        return reverse.contentEquals(straight)
    }
}