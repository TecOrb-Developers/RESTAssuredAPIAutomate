package com.api.Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import io.qameta.allure.Attachment;

/**
 * 
 * @author Ankesh Kumar
 *
 */

/*
 * Listener class which is implementing ITestListener and hence we can use this to dynamically create reports, write logs.
 */

public class AllureTestListener implements ITestListener
	{
		
//	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	private static String getTestMethodName(ITestResult iTestResult)
	{
	    return iTestResult.getMethod().getMethodName();
	}
	
	// Screenshot attachments for Allure
	@Attachment(value = "Web Page Screenshot", type = "image/png")
	public byte[] saveScreenshotPNG(WebDriver driver)
	{		
		// Take a screenshot as byte array and return
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	// HTML attachments for Allure
	@Attachment(value = "{0}", type = "text/html")
	public static String attachHtml(String html)
	{
		return html;
	}
	
	// Text attachments for Allure
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message)
	{
		return message;
	}
	
	@Override 
    public void onStart(ITestContext iTestContext)
    {
        System.out.println("Start script report: " + iTestContext.getName());
    }
 
    @Override
    public void onFinish(ITestContext iTestContext)
    {
        System.out.println("Finish script report: " + iTestContext.getName());     
    }
 
    @Override
    public void onTestStart(ITestResult iTestResult)
    {
        System.out.println("Start test method: " + getTestMethodName(iTestResult));
    }
 
    @Override
    public void onTestSuccess(ITestResult iTestResult)
    {
        System.out.println("Success test method: " + getTestMethodName(iTestResult));  
    }
 
    @Override
    public void onTestFailure(ITestResult iTestResult)
    {
        System.out.println("Failure test method: " + getTestMethodName(iTestResult) + " Failed");
	}
	
    @Override
	public void onTestSkipped(ITestResult iTestResult)
	{
	    System.out.println("Skipped test method " + getTestMethodName(iTestResult));
	}
	 
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult)
	{
	    System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}

}
