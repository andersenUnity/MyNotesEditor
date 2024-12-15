package functions

import Topic
import TopicList

fun addNewTopic(topics: TopicList) {
    print("Enter your topic header here: ")
    val topicHeader = readln().trimStart()
    if (topicHeader.isNotBlank()) {
        topics.add(Topic(topicHeader))
        printEmptyLines()
    } else {
        println("You wrote \"nothing\"")
        Thread.sleep(1000)
        printEmptyLines()
    }
}

fun deleteNote(
    notes: MutableList<MutableList<String>>,
    numberOfNote: Int?,
    deleteAll: String?,
): MutableList<MutableList<String>> {

    if (deleteAll == "all") {
        notes.removeAt(numberOfNote!! - 1)
        return notes
    }
    val paragraph = notes[numberOfNote!! - 1].toMutableList()
    var isOpen = false

    println("Which description do you want to del: ")
    println("Enter \"all\" if you want to clear all")

    while (isOpen == false) {

        val userInput: String? = readlnOrNull()?.uppercase()

        when {

            userInput?.toIntOrNull() != null -> {
                paragraph.removeAt(userInput.toInt() - 1)
                notes[numberOfNote - 1] = emptyList<String>().toMutableList()
                notes[numberOfNote - 1] = (notes[numberOfNote - 1] + paragraph).toMutableList()
                isOpen = true
            }

            userInput == "ALL" -> {
                notes[numberOfNote - 1] = emptyList<String>().toMutableList()
                isOpen = true
            }

            userInput?.toIntOrNull() == null && userInput != "ALL" -> {
                println("Wrong number of note")
            }
        }
    }
    return notes
}

fun deleteTopic(topics: MutableList<String>, numberOfNoteToDel: Int?): MutableList<String> {

    topics.removeAt(numberOfNoteToDel!! - 1)

    return topics
}