import kotlinx.serialization.*
import kotlinx.serialization.json.*


typealias TopicList = MutableList<Topic>
@Serializable
data class Topic(
    var header: String = "",
    val notes: MutableList<String> = mutableListOf()
){

}
fun jopa() {
    // Пример сериализации
    val topic = Topic
    val jsonString = Json.encodeToString(topic)
    println(jsonString) // {"name":"John","age":30}

    // Пример десериализации
    val deserializedTopic = Json.decodeFromString<Topic>(jsonString)
    println(deserializedTopic) // Person(name=John, age=30)
}
