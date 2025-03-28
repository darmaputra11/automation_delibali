import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import utils.CommonMethods as CommonMethods
import initialsObject.LoginObject

// Buat instance dari CommonMethods
CommonMethods cm = new CommonMethods()

//Open App
cm.openAppDirectly()

//For change account quickly
int idAccount = 1
TestData data = findTestData('Data Files/Auth/LoginCredentials')
String phonenumber = data.getValue('phonenumber', idAccount)
String password = data.getValue('password', idAccount)

//Verify already on Login page
Mobile.waitForElementPresent(LoginObject.phonenumberField, 0)

//Filled all form
Mobile.setText(LoginObject.phonenumberField, phonenumber, 0)
Mobile.setText(LoginObject.passwordField, password, 0)
Mobile.hideKeyboard()

//Clear field, Check Error & filled again
Mobile.clearText(LoginObject.phonenumberField, 0)
boolean phonenumberError = Mobile.verifyElementExist(LoginObject.phonenumberError, 5)
assert phonenumberError == true : "Error phone number not appear!"
Mobile.tap(LoginObject.loginButton, 0)
Mobile.setText(LoginObject.phonenumberField, phonenumber, 0)
Mobile.hideKeyboard()

Mobile.clearText(LoginObject.passwordField, 0)
boolean passwordError = Mobile.verifyElementExist(LoginObject.passwordError, 5)
assert passwordError == true : "Error password not appear!"
Mobile.tap(LoginObject.loginButton, 0)
Mobile.setText(LoginObject.passwordField, password, 0)
Mobile.hideKeyboard()

// Click Login
Mobile.tap(LoginObject.loginButton, 0)

//Wait until Homepage
Mobile.waitForElementPresent(findTestObject('Object Repository/Homepage/Homepage_Title_Category'), 0)

//Close App
Mobile.closeApplication()





