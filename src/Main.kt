/*
Map
 - mapOf () : 불변
 - mutableMapOf () : 가변
 - <Generic> 생략 가능
 
객체 호출
 - .get
 - []

기타 Map Method
 - size () : 관리하는 요소의 개수
 - keys () : key 를 배열로 반환
 - values () : 객체들을 배열로 반환
 - containsKey () : 지정된 이름으로 저장된 객체가 있는지 확인합니다.
 - containsValue () : 지정된 값으로 저장된 객체가 있는지 확인합니다.

가변형 Map Method
 - put () : 객체를 추가합니다. 기존 이름과 동일할 경우 덮어 씌웁니다.
 - remove () : 해당 값이 이름으로 저장된 객체를 제거합니다.
 */
fun main() {

    val map0 = mapOf ("key1" to 11, "key2" to 22, "key3" to 33)
    println("map0 : $map0") // => map1 : {key1=10, key2=20, key3=30}

    val map1 = mapOf <String, Int> ("key1" to 10, "key2" to 20, "key3" to 30)
    println("map1 : $map1") // => map1 : {key1=10, key2=20, key3=30}

    val map2 = mutableMapOf <String, Int> ()
    println("map2 : $map2") // => map2 : {}

    val map3 = mapOf <String, Any> ("key1" to 10, "key2" to 11.11, "key3" to true)
    println("map3 : $map3")

    println("----- Map 호출 -----")

    println("map1 key1 : ${map1.get("key1")}")
    println("map1 key2 : ${map1["key2"]}")

    println("----- Map Method -----")

    println("map1.size : ${map1.size}")
    println("map1.keys : ${map1.keys}")
    println("map1.values : ${map1.values}")

    println("map1.contains (\"key1\") : ${map1.contains ("key1")}")
    println("map1.contains (\"key100\") : ${map1.contains ("key100")}")

    println("map1.containsValue(10) : ${map1.containsValue(10)}")
    println("map1.containsValue(100) : ${map1.containsValue(100)}")

    println("----- Map Method -----")

    println("map2 : $map2")

    map2.put("key1", 100)
    println("map2 : $map2")

    map2["key2"] = 200
    println("map2 : $map2")

    map2.put("key1", 1000)
    println("map2 : $map2")

    map2.remove("key1")
    println("map2 : $map2")

    val map100 = map1.toMutableMap()
    map100.put("key100", 1000)
    map100["key200"] = 2000
    println("map100 : $map100")

    val map200 = map100.toMap()
    // map200["key200"] = 20000 // 오류발생 : map200 은 불변형 map


}








