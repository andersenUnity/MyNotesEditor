package functions

import Topic
import TopicList
import kotlinx.serialization.json.Json
import java.io.File


fun addNewTopic(topics: TopicList) {
    print("Enter your topic header here: ")
    val topicHeader = readln().trimStart()
    if (topicHeader.isNotBlank()) {
        topics.add(Topic(topicHeader))
        printEmptyLines()
    } else {
        printErrorEmptyInput()
    }
}

fun deleteTopic(topics: TopicList) {
    print("Enter number of topic to delete: ")
    if (topics.isNotEmpty()) {
        val numberOfSelectedTopic: Int? = readln().toIntOrNull()?.minus(1)
        when {
            numberOfSelectedTopic == null || numberOfSelectedTopic !in 0..<topics.size -> {
                printErrorIncorrectInputOfNumber()
            }

            else -> {
                topics.removeAt(numberOfSelectedTopic)
                printEmptyLines()
            }
        }
    } else
        println("You dont have anything to delete")
}

fun addNote(topic: Topic) {
    print("Enter your note here: ")
    val note = readln().trimStart()
    if (note.isNotBlank()) {
        topic.notes.add(note)
        printEmptyLines()
    } else {
        printErrorEmptyInput()
    }
}

fun deleteNote(topic: Topic) {
    print("Enter number of note to delete: ")
    if (topic.notes.isNotEmpty()) {
        val numberOfSelectedNote: Int? = readln().toIntOrNull()?.minus(1)
        when {
            numberOfSelectedNote == null || numberOfSelectedNote !in 0..<topic.notes.size -> {
                printErrorIncorrectInputOfNumber()
            }

            else -> {
                topic.notes.removeAt(numberOfSelectedNote)
                printEmptyLines()
            }
        }
    } else {
        println("You dont have anything to delete")
    }
}

fun serialize(topicList: TopicList, fileName: String) {

    val jsonString = Json.encodeToString(topicList)
    File(fileName).writeText(jsonString)

}

fun deserialize(fileName: String): MutableList<Topic> {
    val jsonString = File(fileName).readText()
    return Json.decodeFromString(jsonString)
}