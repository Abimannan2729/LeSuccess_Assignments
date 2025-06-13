def input = "hello world hello" 
def words = input.toLowerCase().split("\\s+")
def frequencyMap = [:]

words.each { word ->
    frequencyMap[word] = frequencyMap.get(word, 0) + 1
}

println "\nWord Frequency:"
frequencyMap.each { word, count ->
    println "$word → $count"
}
