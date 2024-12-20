package functions

import Topic
import TopicList

fun getNotes(topic: Topic) {

    if (topic.notes.isNotEmpty()) {
        topic.notes.forEachIndexed { index, noteContent ->
            println("${index+1}. $noteContent")
        }
    } else {
        println("Your notes list is empty")
    }
    println("\n\n\n")
}

fun getTopics(topics: TopicList) {
    topics.forEachIndexed { index, topic ->
        println("${index + 1}. ${topic.header} [notes = ${topic.notes.size}]")
    }
    println("\n")
}
