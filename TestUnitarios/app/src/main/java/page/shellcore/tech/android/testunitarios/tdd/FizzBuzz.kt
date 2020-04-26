package page.shellcore.tech.android.testunitarios.tdd

class FizzBuzz {
    fun of(num: Int): String {
        if (num == 0) {
            return "0"
        }

        var response = ""

        if (num%3 == 0) {
            response += "Fizz"
        }
        if (num%5 == 0) {
            response += "Buzz"
        }
        if (response.isBlank()) {
            response = "$num"
        }

        return response
    }
}