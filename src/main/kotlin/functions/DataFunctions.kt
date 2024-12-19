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

fun deleteTopic(topics: TopicList) {
    print("Enter number of topic to delete: ")
    val numberOfSelectedTopic = readln().toInt() - 1
//    val topic = topics[numberOfSelectedTopic]
    if (topics.isNotEmpty()) {
//        topic.notes.clear()
        topics.removeAt(numberOfSelectedTopic)
        printEmptyLines()
    } else {
        println("You wrote \"nothing\"")
        Thread.sleep(1000)
        printEmptyLines()
    }

}

fun addNote(topic: Topic) {
    print("Enter your note here: ")
    val note = readln().trimStart()
    topic.notes.add(note)

}

fun deleteNote (topic: Topic) {
    print("Enter number of note to delete: ")
    val numberOfSelectedNote = readln().toInt() - 1
    if (topic.notes.isNotEmpty()) {
        topic.notes.removeAt(numberOfSelectedNote)
        printEmptyLines()
    } else {
        println("You wrote \"nothing\"")
        Thread.sleep(1000)
        printEmptyLines()
    }

}