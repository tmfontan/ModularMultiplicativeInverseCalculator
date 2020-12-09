/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularinversecalculator;

import java.math.BigInteger;

/**
 *  This Class is Responsible for Creating
 *  a Custom Return Value Object for our
 *  Modular Multiplicative Inverse Calculation
 *  Process. This Return Object Contains a
 *  Boolean Result Status Variable which tells us 
 *  Whether or Not a Modular Multiplicative Inverse 
 *  has been found for the Parameter Number Set, 
 *  a BigInteger Object Containing the Modular 
 *  Multiplicative Inverse should one be found, 
 *  and a BigInteger Object Containing the Number 
 *  of Steps Needed to Find the Modular 
 *  Multiplicative Inverse, and Integer Value
 *  Telling us Which Method was Used.
 * 
 *  @date       November 15, 2020
 *  @author     Tyler Fontana
 *  @version    1.0.1
 */
public class MMIReturnValue {
    
    // Variable Meant to Hold the Overall
    // Result of the Modular Multiplicative Inverse
    // Calculation Process.
    //
    //  True     -   Modular Multiplicative Inverse
    //               Has Been Found.
    //
    //  False    -   Modular Multiplicative Inverse
    //               Has Not Been Found.
    //
    public boolean result;
    // The Value of the Modular Multiplicative Inverse
    // if it has been found.
    public BigInteger modInverse;
    // The Number of Steps / Iterations that were
    // needed to Calculate the Modular Multiplicative 
    // Inverse if the Operation was Successful.
    public BigInteger counter;
    // The Integer Value Telling Us Which Type of
    // Method was Used to Find the Inverse.
    //
    // 0    -   Naive Method
    // 1    -   Extended Euclidean Algorithm Method.
    //
    public int method;
    
    /**
     *  This Constructor is used to Create a New
     *  Instance of the MMIReturnValue Object.
     * 
     *  @param res              The Overall Result of
     *                          the Modular Multiplicative
     *                          Inverse Calculation Process.
     * 
     *  @param inverse          The Number that is Determined
     *                          as the Modular Multiplicative
     *                          Inverse of the Number Set.
     * 
     *  @param steps            The Number of Steps Needed to
     *                          Reach the Modular Multiplicative
     *                          Inverse if it has been found.
     * 
     *  @param type             The Method Approach that was
     *                          used to Calculate the MMI Value.
     */
    public MMIReturnValue(boolean res, BigInteger inverse, BigInteger steps, int type) {
        // Set the Overall Result Status
        this.result = res;
        // Set the MMI Number Value
        this.modInverse = inverse;
        // Set the Number of Steps /
        // Iterations Taken.
        this.counter = steps;
        // The Calculation Process
        // invoked.
        this.method = type;
    }
    
    /**
     *  This Getter Method is Responsible for
     *  Retrieving the Overall Result of the
     *  Modular Multiplicative Inverse Calculation.
     * 
     *  @return         Boolean Value Letting the
     *                  GUI Window Know Whether or
     *                  Not a MMI Value was Found.
     */
    public boolean getResult() {
        // Return the Overal Status
        // of the Calculation Value. 
        return this.result;
    }
    
    /**
     *  This Getter Method is Responsible for
     *  Retrieving the BigInteger Object Containing
     *  the Modular Multiplicative Inverse Value.
     * 
     *  @return         BigInteger Value Containing the
     *                  Modular Multiplicative Inverse
     *                  Value.
     */
    public BigInteger getModularInverse() {
        // Return the MMI Value
        return this.modInverse;
    }
    
    /**
     *  This Getter Method is Responsible for
     *  Retrieving the Number of Steps / Iterations
     *  it Took in order to find the Modular 
     *  Multiplicative Inverse Value.
     * 
     *  @return         BigInteger Value Containing the
     *                  Number of Steps / Iterations
     *                  Performed.
     */
    public BigInteger getCounter() {
        // Return the Number of Steps.
        return this.counter;
    }
    
    /**
     *  This Getter Method is Responsible for
     *  Retrieving the Method Type That Was Used
     *  in Calculating the Modular Multiplicative
     *  Inverse Value.
     * 
     *  @return         Integer Value Telling the
     *                  GUI which Method was invoked.
     */
    public int getMethodType() {
        // The Type of Method
        return this.method;
    }
    
    /**
     *  This Setter Method is Responsible for Setting
     *  the Overall Boolean Result Value of Operation
     *  to find the Modular Multiplicative Inverse
     *  Associated with this Object Instance.
     * 
     *  @param value        The Overall Result Boolean
     *                      Value
     */
    public void setResult(boolean value) {
        // Set the Overall Result
        this.result = value;
    }
    
    /**
     *  This Setter Method is Responsible for Setting
     *  the Modular Multiplicative Inverse Value
     *  Associated with this Object Instance.
     * 
     *  @param value        The Modular Multiplicative 
     *                      Inverse BigInteger Value
     */
    public void setModularInverse(BigInteger value) {
        // Set the MMI Value.
        this.modInverse = value;
    }
    
    /**
     *  This Setter Method is Responsible for Setting
     *  the Number of Steps / Iterations Performed in 
     *  order to Find the Modular Multiplicative 
     *  Inverse Value Associated with this Object Instance.
     * 
     *  @param value        The Number of Steps Performed
     *                      in Calculating the MMI Value.
     */
    public void setCounter(BigInteger value) {
        // Set the Steps / Iterations Counter
        // Variable.
        this.counter = value;
    }
    
    /**
     *  This Setter Method is Responsible for Setting
     *  the Type of Method Invoked to Find the Modular
     *  Multiplicative Inverse Value.
     * 
     *  @param value        The Type of Method.
     */
    public void setMethodType(int value) {
        // Set the Method Type.
        this.method = value;
    }
 }
