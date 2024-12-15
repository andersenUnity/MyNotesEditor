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
                /*println("Choose number of topic to delete...")

                while(true){

                    if (topicList.isEmpty()) {
                        println("You dont have any topic to del")
                        printEmptyLines()
                    } else {

                        val numberOfNoteToDel = readln().toIntOrNull() ?: 0

                        when {
                            numberOfNoteToDel  == 0 -> {
                                println("Invalid command, please, try again")
                                continue
                            }

                            numberOfNoteToDel != 0 && numberOfNoteToDel <= topicList.size -> {
                                deleteAll = "all"
                                topicList = deleteTopic(topicList, numberOfNoteToDel)
                                notes = deleteNote(notes, numberOfNoteToDel, deleteAll)
                                printEmptyLines()
                                break
                            }
                        }
                    }
                }*/
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

                        val topic = topicList[numberOfSelectedTopic-1]

                        getNotes(topic)
                        print("Enter command here: ")
                        val noteInput: String = readln()

                        /*when (noteInput) {
                            "+" -> {
                                notes = addTopic(notes, numberOfSelectedTopic, noteContent)
                                printEmptyLines()
                            }

                            "-" -> {
                                deleteNote(notes, numberOfSelectedTopic, deleteAll)
                                if (notes[numberOfSelectedTopic - 1].isNotEmpty()) {
                                    println(notes)
                                }
                            }

                            "q" -> {
                                printEmptyLines()
                                isNoteOpened = true
                            }
                        }*/
                    }

                } else {
                    println("This app dont have such command")

                }
            }
        }
    }
}

