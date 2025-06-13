def wordList = ["hi", "hello", "bye", "good", "sun","a","b","abi"]
def grouped = [:].withDefault { [] }

wordList.each { word ->
    grouped[word.length()] << word
}


grouped.each { length, words ->
    println "$length → $words"
}
