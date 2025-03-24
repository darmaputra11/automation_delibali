package initialsObject

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginObject {
	// ** Login Page **
	static TestObject loginButton = findTestObject('Object Repository/Authentication/Login/Login_Button_Login')
	static TestObject phonenumberField = findTestObject('Object Repository/Authentication/Login/Login_Input_PhoneNumber')
	static TestObject registerButton = findTestObject('Object Repository/Authentication/Login/Login_TextButton_Register')
	static TestObject forgotpasswordButton = findTestObject('Object Repository/Authentication/Login/Login_TextButton_ForgotPassword')
	static TestObject passwordField = findTestObject('Object Repository/Authentication/Login/Login_Input_Password')
	static TestObject cantloginModal = findTestObject('Object Repository/Authentication/Login/Login_Error_Cantlogin')
	static TestObject passwordError = findTestObject('Object Repository/Authentication/Login/Login_Error_Password')
	static TestObject phonenumberError = findTestObject('Object Repository/Authentication/Login/Login_Error_PhoneNumber')
	static TestObject signinButton = findTestObject('Object Repository/Authentication/Login/Login_Button_Sign In As Guest')
	static TestObject eyeIcon = findTestObject('Object Repository/Authentication/Login/Login_Button_EyeIcon')
	static TestObject phoneCode = findTestObject('Object Repository/Authentication/Login/Login_Button_PhoneCode')
}
