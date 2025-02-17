```scala
class MyClass {
  private var internalValue: Int = 0

  def value: Int = internalValue
  def value_=(newValue: Int): Unit = {
    if (newValue < 0) {
      throw new IllegalArgumentException("Value cannot be negative")
    } else {
      internalValue = newValue
    }
  }
}

val myObject = new MyClass()
myObject.value = 10
println(myObject.value) // Output: 10

try {
  myObject.value = -5
} catch {
  case e: IllegalArgumentException => println(e.getMessage) // Output: Value cannot be negative
}
```