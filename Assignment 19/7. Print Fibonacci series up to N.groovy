

def printfibo(n) {
    def a = 0
    def b = 1
    print "$a $b "
    
    for (int i = 2; i < n; i++) {
        def c = a + b
        a = b
        b = c
        print "$c "
    }
    println()
}

Scanner sc = new Scanner(System.in)
println "Enter a N value to print Fibonacci series:"
def n = sc.nextInt()

printfibo(n)
