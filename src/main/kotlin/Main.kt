import functions.*


fun main() {
    val topicList: TopicList = mutableListOf()

    while (true) {
        var isNoteOpened = false
        var numberOfSelectedTopic: Int

        printHelpTopicsCommands()

        if (topicList.isEmpty()) {
            println("Your topics list is empty\n\n")
        } else getTopics(topicList)

        print("Enter command here: ")

        val commandInput: String = readln()

        when (commandInput) {
            "+" -> {
                addNewTopic(topicList)
            }

            "-" -> {
                deleteTopic(topicList)

            }


            "q" -> {
                printEmptyLines()
                break
            }

            else -> {
                if (commandInput.toIntOrNull() != null) {
                    numberOfSelectedTopic = commandInput.toInt()

                    if (numberOfSelectedTopic > topicList.size || numberOfSelectedTopic <= 0) {
                        println("You dont have such topic")
                        continue
                    }

                    while (!isNoteOpened) {
                        printEmptyLines()
                        printHelpNotesCommands()

                        val topic = topicList[numberOfSelectedTopic - 1]

                        getNotes(topic)
                        print("Enter command here: ")
                        val noteInput: String = readln()

                        when (noteInput) {
                            "+" -> {
                                addNote(topic)
                                printEmptyLines()
                            }

                            "-" -> {
                                deleteNote(topic)

                            }

                            "all" -> topic.notes.clear()

                            "q" -> {
                                printEmptyLines()
                                isNoteOpened = true
                            }
                        }
                    }

                } else {
                    println("This app dont have such command")
                }
            }
        }
    }
}

