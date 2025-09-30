# Java Calculator

A simple console calculator with **robust input handling**.  
Supports basic operations: `+  -  *  /`. Protects against invalid input and division by zero.

## Features
- Reads numbers safely (re-prompts on invalid input).
- Validates operator (`+ - * /` only).
- Prevents division by zero (asks to re-enter the second number).
- Prints result as `double` for `/`.

## Requirements
- Java 21+ (17+ also works)
- Any IDE (IntelliJ IDEA) or terminal (`javac`/`java`)

## How to Run

### Via terminal
```bash
# compile to out/
javac -d out src/org/example/Calculator.java

# run by fully qualified class name
java -cp out org.example.Calculator
```

### Via IntelliJ IDEA
Open the project → right-click `Calculator.main()` → **Run `Calculator.main()`**.

## Examples

### Normal flow
```text
Enter first number:
10
Enter second number:
5
Enter operation (+ - * /):
/
Result: 2.0
```

### Invalid number input
```text
Enter first number:
abc
Not a number. Try again.
```

### Division by zero
```text
Enter operation (+ - * /):
/
Division by zero is not allowed. Enter the second number again:
0
Not a number. Try again.
```

### Unknown operation
```text
Enter operation (+ - * /):
%
Unknown operation. Allowed: + - * /. Try again:
```

## Project structure
```text
src/
└─ org/
└─ example/
└─ Calculator.java
```

## Notes
- Numbers are parsed from `String` with `Double.parseDouble(...)` inside `try/catch`.
- Operator is validated before calculation.
- For `/` the program re-asks for the second number until it’s non-zero.
