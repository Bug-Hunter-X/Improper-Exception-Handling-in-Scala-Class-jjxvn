# Improper Exception Handling in Scala

This repository demonstrates a common error in Scala: neglecting robust exception handling. The `MyClass` example throws an `IllegalArgumentException` if a negative value is assigned to the `value` property.  However, this exception isn't handled gracefully within the class itself, requiring external handling.

The `MyClass.scala` file shows the problematic code.  The solution improves the design.