package com.api.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

 
public class Retry implements IRetryAnalyzer {
 
    private int count = 1;
    private static int maxTry = 1; //To Run the failed test n number of times.
 
    
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                      //Check if test not succeed
            if (count < maxTry) {                            //Check if maxTry count is reached
                count++;                                     //Increase the maxTry count by 1
                iTestResult.setStatus(ITestResult.FAILURE);  //Mark test as failed   
                return true;                                 //Tells TestNG to re-run the test
            }
        }
        else {
            iTestResult.setStatus(ITestResult.SUCCESS);      //If test passes, TestNG marks it as passed
        }
        return false;
    }
 
    
}