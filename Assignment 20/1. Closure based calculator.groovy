def calculate(a, b, operation) {
    operation(a, b)
}

// Add
def add = { x, y -> x + y }
println "Addition: ${calculate(10, 5, add)}"

// Subtract
def subtract = { x, y -> x - y }
println "Subtraction: ${calculate(10, 5, subtract)}"

// Multiply
def multiply = { x, y -> x * y }
println "Multiplication: ${calculate(10, 5, multiply)}"
