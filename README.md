# Modular Multiplicative Inverse Calculator
This Java Swing GUI Tool is used in order to find the Modular Multiplicative Inverse Value of a set of two user-inputted numbers (A, M). The Modular Multiplicative Inverse Value is used in fields such as Cryptography Public-Key Generation and the Rivest–Shamir–Adleman (RSA) Algorithm. The Modular Multiplicative Inverse Value is defined as the Integer Value m, which, when divided by the expression (A * X), produces a Remainder Value of 1. The X Value within the previous expression symbolizes the Iteration or Loop Number Value which satisfies the Equation (A * X) / M = 1.

There are two approaches to finding the Modular Multiplicative Inverse Value. The First Approach, named the "Naive" Method, involves continously iterating through every possible positive value X, until we reach the value which satifies the equation (A * X) / M = 1. While this method is applicable when dealing with small scale numbers, it quickly becomes inefficent when dealing with Number Sets on an exponentially large scale.
