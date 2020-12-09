/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularinversecalculator;

import java.math.BigInteger;

/**
 *  This Class is Responsible For Holding the
 *  Methods used for finding the Modular Multiplicative
 *  Inverse of a Set of two Numbers provided by the
 *  User. One Method finds the Modular Multiplicative
 *  Inverse in the Naive Manner While the other uses 
 *  the Extended Euclidean Algorithm in order find the 
 *  Modular Multiplicative Inverse of the Number set.
 * 
 *  @date       November 10, 2020
 *  @author     Tyler Fontana
 *  @version    1.0.1
 */
public class ModularMultiplicativeInverse {
    
    // Initialize Big Integer Object Values For Comparison
    // Operations.
    //
    // Initialize Value for the Integer '1'.
    public static BigInteger POSITIVEONEVALUE = new BigInteger("1");
    // Initialize Value for the Integer '-1'.
    public static BigInteger NEGATIVEONEVALUE = new BigInteger("-1");
    // Initialize Value for the Integer '0'.
    public static BigInteger ZEROVALUE = new BigInteger("0");
    // Declare Variable to Hold Final Inverse Result.
    public static BigInteger INVERSE_VALUE;
    
    // Boolean Variable Used to Break the
    // Iteration Loop in the Naive Approach.
    public static boolean breaker = false;
    
    
    /**
     *  Basic Constructor used to Create a Reference
     *  to the Current Class Instance.
     */
    public ModularMultiplicativeInverse() {
        // Create Reference to Class Instance
    }
    
    /**
     *  This method used the Extended Euclidean Algorithm in Order
     *  to find the Modular Multiplicative Inverse of the Two Numbers 
     *  Provided by the User in the GUI Class.
     * 
     *  @param a        The BigInteger Value Containing the Value
     *                  of the 'X' Variable or the Variable to be
     *                  Modded.
     * 
     *  @param m        The BigInteger Value Containing the Value
     *                  of the Mod Integer which the X Variable will
     *                  be Modded by.
     * 
     *  @return         The Modular Multiplicative Inverse of the
     *                  Provided Number Set.
     */
    public static MMIReturnValue modInverseEEA(BigInteger a, BigInteger m) { 
        
        // Create a Return Object Which We will Use to Send the Results of the
        // Modular Inverse Calculation Back to the GUI Form.
        MMIReturnValue returnValue = new MMIReturnValue(false, NEGATIVEONEVALUE, NEGATIVEONEVALUE, 1);
        // Increment Counter used for Determining How Many 
        // Operations were Performed to find the Inverse.
        BigInteger COUNTER = new BigInteger("1");
    
        // Save the Original Mod Value.
        // for later Use.
        BigInteger mod = m; 
        // Create and Initialize the Y
        // Variable with a Value of Zero.
        BigInteger y = ZEROVALUE;
        // Create and Initialize the X
        // Variable with a Value of One.
        BigInteger x = POSITIVEONEVALUE; 
  
        // If the Two Numbers in the Set Are
        // the Same Value, then there is No
        // Modular Inverse.
        if (a.compareTo(m) == 0) {
            // Show that We have Failed to Find
            // the Modular Inverse of the Number Set.
            returnValue.setResult(false);
            // Return the Result
            return returnValue;
        }
        // If the Mod Value m in the Set is 0,
        // then there is no Modular Invesere.
        else if (m.compareTo(ZEROVALUE) == 0) {
            // Show that We have Failed to Find
            // the Modular Inverse of the Number Set.
            returnValue.setResult(false);
            // Return the Result
            return returnValue;
        }
        // If the Mod Value is 1, then the
        // the Modular Multiplicative Inverse
        // of the Number Set is Zero.
        else if (m.compareTo(POSITIVEONEVALUE) == 0) {
            // Show that We have Successfully Found
            // the Modular Inverse of the Number Set.
            returnValue.setResult(true);
            // Show that the Modular Invers is Zero.
            returnValue.setModularInverse(ZEROVALUE);
            // Show the Number of Steps it took to
            // Find the Modular Inverse.
            returnValue.setCounter(COUNTER);
            
            // Return the Results
            return returnValue; 
        }
  
        // Continously Loop Until The X Value becomes
        // the Positive Value of 1. Once we reach this
        // Value, we can begin the Extended Version of
        // the Euclidean Algorithm.
        while (a.compareTo(POSITIVEONEVALUE) > 0) { 
            // Store the Quotient Integer Value of
            // how Many Times the Mod Value 'm' is
            // capable of going into the provided
            // X Value. (Note: This Value will Return
            // a Non-Decimal Integer.)
            //
            // Equation: (q = a / m)
            BigInteger q = a.divide(m);
            // Store the Original Value of
            // the Mod Variable in a Temporary
            // Variable for Value Subsitution.
            BigInteger t = m; 
  
            // Set the Mod Value as the Remainder
            // of the Mod Operation performed in the
            // Current Equation.
            //
            // Equation: (a mod m1) = m2
            // 
            // Variable 'm2' = New Mod Value
            m = a.mod(m);
            // Set the Previous Mod Value as the
            // new X Variable Value.
            a = t; 
            // Save the Old 'y' Value
            // in the Temporary Integer
            // Variable t.
            //
            // Equation: x = (m * x) + y;
            t = y; 
  
            // Update 'y' Variable to Hold the
            // Next Operation Remainder Value.
            y = x.subtract(q.multiply(y)); 
            // Update 'x' Variable to Hold the
            // next Operation Quotient Value.
            x = t; 
            
            // Increment the Steps Counter.
            COUNTER = incrementValue(COUNTER);
        } 
  
        // Make the X Variable Value Positive if
        // it becomes Negative.
        if (x.compareTo(ZEROVALUE) < 0) {
            // Multiply the Current X Value By
            // the Value of -1 if it is currently
            // Negative.
            x = x.add(mod);
        }
        
        // Show that We have Successfully Found
        // the Modular Inverse of the Number Set.
        returnValue.setResult(true);
        // Show that the Modular Invers is the X Value.
        returnValue.setModularInverse(x);
        // Show the Number of Steps it took to
        // Find the Modular Inverse.
        returnValue.setCounter(COUNTER);

        // Return the Results
        return returnValue; 
    }
    
    /**
     *  This Method is Used to Find the Modular Multiplicative 
     *  Inverse of Two Numbers using the Naive Approach. This
     *  Approach Essentially iterates through and Substitutes all
     *  of the possible Values (m - 1) of the Mod Number into
     *  the Equation to Find the Modular Inverse of the Number Set.
     * 
     *  @param  a           The Big Integer Value X that the
     *                      Mod Value m will be Divided From.
     * 
     *  @param  m           The Mod Value that will be used to
     *                      Divide the X Value.
     */
    public static MMIReturnValue findInverse(BigInteger a, BigInteger m) {
        
        // Create a Return Object Which We will Use to Send the Results of the
        // Modular Inverse Calculation Back to the GUI Form.
        MMIReturnValue returnValue = new MMIReturnValue(false, NEGATIVEONEVALUE, NEGATIVEONEVALUE, 0);
        // Increment Counter used for Determining How Many 
        // Operations were Performed to find the Inverse.
        BigInteger COUNTER = new BigInteger("1");
        
        // Find the Max Value of the Big Integer Value B by
        // Substracting a Value of 1 from the Parameter Mod
        // Number 'm'.
        BigInteger MAX_VALUE = m.subtract(POSITIVEONEVALUE);
        
        //BigInteger t = POSITIVEONEVALUE;
        
        // If the Two Numbers in the Set Are
        // the Same Value, then there is No
        // Modular Inverse.
        if (a.compareTo(m) == 0) {
            // Show that We have Failed to Find
            // the Modular Inverse of the Number Set.
            returnValue.setResult(false);
            // Return the Result
            return returnValue;
        }
        // If the Mod Value m in the Set is 0,
        // then there is no Modular Invesere.
        else if (m.compareTo(ZEROVALUE) == 0) {
            // Show that We have Failed to Find
            // the Modular Inverse of the Number Set.
            returnValue.setResult(false);
            // Return the Result
            return returnValue;
        }
        // If the Mod Value is 1, then the
        // the Modular Multiplicative Inverse
        // of the Number Set is Zero.
        else if (m.compareTo(POSITIVEONEVALUE) == 0) {
            // Show that We have Successfully Found
            // the Modular Inverse of the Number Set.
            returnValue.setResult(true);
            // Show that the Modular Invers is Zero.
            returnValue.setModularInverse(ZEROVALUE);
            // Show the Number of Steps it took to
            // Find the Modular Inverse.
            returnValue.setCounter(COUNTER);
            
            // Return the Results
            return returnValue; 
        }
        
        // Find the Remainder of Variable 'A'
        // Mod Variable 'B'.
        a = a.mod(m);
        
        //  Continously Loop Until we Find the Modular Multiplicative
        //  Inverse or we have Iterated through the Set of Numbers (m - 1).
        //
        //  In each iteration of the Loop, we will Increment the Variable t,
        //  and use it in the Equation: 
        //
        //  (a * t) % m
        //
        //  If this Equation Ends Up Evaluating to the Value of Positive 1,
        //  then we have Found the Modular Multiplicative Inverse of the
        //  Parameter Number Set and Return the Custom Return Object with the
        //  Variable t as the Modular Multiplicative Inverse. Should we iterate 
        //  through all of the values (m - 1) without finding a t value which 
        //  makes the Equation Evalute to the Value of Positive One, then return
        //  the Custom Return Value with a Boolean Status Value of False. This Lets
        //  the GUI Program Know that the Process was Successful but there is no
        //  inverse Found.
        //
        for (BigInteger t = POSITIVEONEVALUE; t.compareTo(m) < 0; t = incrementValue(t)) {
            // Check to see if the Equation: (a * t) % m
            // Evaluates to the Value of Positive One. If So,
            // We have found the Modular Multiplicative Inverse
            // of the Number Set.
            if (a.multiply(t).mod(m).compareTo(POSITIVEONEVALUE) == 0) {
                // Show that the Operation was a Success
                // and the Modular Multiplicative Inverse
                // has been found.
                returnValue.setResult(true);
                // Set the Variable T as the Modular 
                // Multiplicative Inverse Return Value.
                returnValue.setModularInverse(t);
                // Show how many Steps it Took to
                // Find the Modular Multiplicative Inverse.
                returnValue.setCounter(COUNTER);
                
                // Return the Custom Return
                // Object.
                return returnValue;
            }
            
            // Increment the Number of Steps or Iterations.
            COUNTER = incrementValue(COUNTER);
        }
        
        // We have failed to Find the
        // Modular Multiplicative Inverse of
        // the Number Set. Thus, return false.
        returnValue.setResult(false);

        // Return the Failed Calculation
        // Process.
        return returnValue;
    }
    
    /**
     *  This Method is used to Increment the
     *  Specified BigInteger Value by a Value of 1.
     *  (Note: This Method is Included Seeing as the
     *  BigInteger Object Type Doesn't Allow the
     *  '++' Increment Operation to be used on
     *  its Created Values.
     * 
     *  @param value        The BigInteger Variable
     *                      that is to be Incremented
     *                      by a Value of 1.
     */
    public static BigInteger incrementValue(BigInteger value) {
        // Increment the Value by 1.
        value = value.add(POSITIVEONEVALUE);
        // Return the Incremented
        // Value.
        return value;
    }
}
