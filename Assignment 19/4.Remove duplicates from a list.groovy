

Scanner sc = new Scanner(System.in)
println "Enter list elements separated by space 
def line = sc.nextLine()
def inputList = line.split(" ").collect { it as int }

def uniqueList = inputList.unique()
println  uniqueList
