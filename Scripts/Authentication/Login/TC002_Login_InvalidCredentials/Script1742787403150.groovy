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

//For change account quickly, just change value following id on test data (LoginCredentials)
int idAccount = 2
TestData data = findTestData('Data Files/Auth/LoginCredentials')
String phonenumber = data.getValue('phonenumber', idAccount)
String password = data.getValue('password', idAccount)

//Make sure already on Login Page
Mobile.verifyElementExist(LoginObject.phonenumberField, 0)

//Set Text on Phone Number Field
Mobile.setText(LoginObject.phonenumberField, phonenumber, 0)
Mobile.hideKeyboard()

//Set Text on Password Field
Mobile.setText(LoginObject.passwordField, password, 0)
Mobile.hideKeyboard()

//Click Login button
Mobile.tap(LoginObject.loginButton, 0)

//Verify Popup Failed Login
Mobile.verifyElementExist(LoginObject.cantloginModal, 0)

Mobile.closeApplication()



