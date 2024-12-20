import kotlinx.serialization.*



typealias TopicList = MutableList<Topic>

@Serializable
data class Topic(
    var header: String = "",
    val notes: MutableList<String> = mutableListOf()
) {

}
