# Modular Multiplicative Inverse Calculator
This Java Swing GUI Tool is used in order to find the Modular Multiplicative Inverse Value of a set of two user-inputted numbers (**A**, **M**). The Modular Multiplicative Inverse Value is used in fields such as Cryptography Public-Key Generation and the Rivest–Shamir–Adleman (RSA) Algorithm. The Modular Multiplicative Inverse Value is defined as the Integer Value **M**, which, when divided by the expression **(A * X)**, produces a Remainder Value of 1. The **X** Value within the previous expression symbolizes the Iteration or Loop Number Value which satisfies the Equation **(A * X) / M = 1**.

There are two approaches to finding the Modular Multiplicative Inverse Value. The First Approach, named the "***Naive***" Method, involves continously iterating through every possible positive value **X**, until we reach the value which satifies the equation **(A * X) / M = 1**. While this method is applicable when dealing with small scale numbers, it quickly becomes inefficent when dealing with Number Sets on an exponentially large scale such as the Number Set: (**13**, **58021664585639791181184025950440248398**). When dealing with Numbers of the previously shown size, it is better to employ the second approach, the "***Extended Euclidean Algorithm***" Method, which achieves the same result in **O(log(n))** Runtime. Instead of continously iterating through every possible value of **X**, which equates to an overall Runtime of **O(n)**, the "***Extended Euclidean Algorithm***" Method will use the Quotient and Remainder values found by the Equation: **A = (M * Q) - R** in the creation of subsequent equations. This Process will be continued until the Remainder Variable of the equation eventually equals the Value of 1, which is also counted as the **GCD(A, M)**. From here, the "***Extended Euclidean Algorithm***" Method will then create a new set of new reversed equations using the Quotient and Remainder Values previously found. Finally, it will subsitute these values into the Original, Last Equation Found (*Equating to the Remainder Vaue of 1*) in order to find the Modular Multiplicative Inverse Value.

This Application allows the user to find the Modular Multiplicative Inverse Value using both approaches via user selection of the "*Use Extended Euclidean Algorithm?*" JCheckbox Swing Component within the GUI Form. 

*(**Note:** Should the User Attempt to Find the Solution of a Number Set Containing Variables Longer than Ten Digits in Length while using the "***Naive***" Approach, then the Program will still find the solution, but take an exponential amount of time to execute.)*

When a Modular Multiplicative Inverse Value is Found, the GUI Form will display it within the Bottom JTextArea Component, and display to the User the Approximate Amount of Steps that were need in order to find the Solution. Should the amount of steps needed, be a value longer than seven digits in length, then the GUI Form will instead display the number in it's Scientific Notation Format. Examples of this process, and how the Application will function and display its solutions can be found in the Images Provided Below:

*(**Note:** This Application was Designed and Tested Using the **Apache Netbeans 11.2** Integrated Development Environment)*

![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Initial.png)
![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Warning_Message_One.png)
![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Warning_Message_Effects_One.png)
![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Warning_Message_Two.png)
![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Warning_Message_Effects_Two.png)
![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Executing.png)
![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Result_Naive.png)
![Alt Text](ModularInverseCalculator/Screenshots/divider_line_neon.png)
![Alt Text](ModularInverseCalculator/Screenshots/Screenshot_Result_EEA.png)
