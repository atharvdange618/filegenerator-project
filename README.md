# PN Sequence Generator in Java

This Java program generates Pseudo-Random Binary Sequence, also known as Pseudo-Noise (PN) sequence. It allows users to input the value of 'k' and generates a PN sequence of length (2^k - 1).

## Overview

The Pseudo-Random Binary Sequence generator operates by employing the concept of Linear Feedback Shift Registers (LFSR). It generates a binary sequence that appears random but follows a deterministic pattern defined by the initial state and the feedback function.

## Implementation

The program prompts the user to enter the value of 'k', where 'k' is the length of the PN sequence, and then proceeds to generate the sequence using the following steps:

1. Take the value of 'k' as input.
2. Calculate the length of the sequence, 'n', using the formula: n = 2^k - 1.
3. Generate 'n' binary digits by using the Math.random() method to obtain a pseudo-random number between 0 and 1 and converting it to a binary digit.

## Usage

1. Compile the `pngenerator.java` file using a Java compiler.
2. Run the compiled Java program.
3. Enter the value of 'k' when prompted.
4. The program will display the generated PN sequence of length (2^k - 1) in the console.

## Example

For instance, if the user inputs 'k = 3', the program will generate a PN sequence of length (2^3 - 1) = 7:

Enter the value of k: 3
Generated PN sequence: 0 1 0 0 1 0 1


## Limitations

This implementation utilizes Math.random(), which may not offer truly random numbers and could exhibit certain statistical patterns. It's suitable for educational and basic purposes but not for cryptographic applications.

## License

This project is available under the MIT License. See the [LICENSE](LICENSE) file for more details.