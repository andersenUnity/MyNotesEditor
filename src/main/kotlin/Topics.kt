
typealias TopicList = MutableList<Topic>

data class Topic(
    var header: String = "",
    val notes: MutableList<String> = mutableListOf()
){

}
