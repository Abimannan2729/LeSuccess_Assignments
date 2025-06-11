

Scanner sc = new Scanner(System.in)
println "Enter first list (space-separated):"
def l1 = sc.nextLine().split(" ").collect { it as int }

println "Enter second list (space-separated):"
def l2 = sc.nextLine().split(" ").collect { it as int }

def common = l1.intersect(l2)
println "Common elements: $common"
