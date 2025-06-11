
def isanagrams(String s1, String s2) {
    if (s1.size() != s2.size()) return false

    def freq = new int[26]  // For lowercase letters a-z

    for (int i = 0; i < s1.size(); i++) {
        freq[(int)(s1.charAt(i)) - (int)('a')]++
        freq[(int)(s2.charAt(i)) - (int)('a')]--
    }

    for (n in freq) {
        if (n != 0) return false
    }

    return true
}

Scanner sc = new Scanner(System.in)

println "Enter first string:"
def s1 = sc.nextLine().toLowerCase()

println "Enter second string:"
def s2 = sc.nextLine().toLowerCase()

println isanagrams(s1, s2)"
