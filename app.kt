fun main() {
   "yo".fastprint()
    printYo()
}

private fun Any.fastprint() = println(this)

private fun printYo() = println("yo")