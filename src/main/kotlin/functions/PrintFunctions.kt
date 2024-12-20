package functions

fun printHelpTopicsCommands() {
    printEmptyLines()
    println("+ - to add the topic")
    println("- - to del the topic")
    println("q - if you want to quit app")
    println("\n")
    println("Chose number of topic, to add notes")
    println("Your topics: ")
}

fun printHelpNotesCommands() {
    printEmptyLines()
    println("+ - to add the notes")
    println("- - to del the notes")
    println("\"all\" to dell all notes")
    println("q - if you want to quit topic")

    println("\n")
}

fun printEmptyLines() {
    println(" \n\n\n\n\n\n\n")
}

fun printErrorEmptyInput() {
    println("You wrote \"nothing\"")
    Thread.sleep(1000)
    printEmptyLines()
}

fun printErrorIncorrectInputOfNumber() {
    println("\n\nYou wrote \"something unpredictable\"")
    Thread.sleep(1000)
    printEmptyLines()
}
