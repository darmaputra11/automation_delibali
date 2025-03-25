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

public class RegisterObject {
	static TestObject fullnamefieldRegister = findTestObject('Object Repository/Authentication/Register/Register_Input_FullName')
	static TestObject emaildfieldRegister = findTestObject('Object Repository/Authentication/Register/Register_Input_Email')
	static TestObject phonenumberfieldRegister = findTestObject('Object Repository/Authentication/Register/Register_Input_PhoneNumber')
	static TestObject malegenderRegister = findTestObject('Object Repository/Authentication/Register/Register_Select_Male')
	static TestObject femalegenderRegister = findTestObject('Object Repository/Authentication/Register/Register_Select_Female')
	static TestObject birthdaypickerRegister = findTestObject('Object Repository/Authentication/Register/Register_DatePicker_Birthday')
	static TestObject nationalitypickerRegister = findTestObject('Object Repository/Authentication/Register/Register_Picker_Nationality')
	static TestObject occupationpickerRegister = findTestObject('Object Repository/Authentication/Register/Register_Picker_Occupation')
	static TestObject familystructurepickerRegister = findTestObject('Object Repository/Authentication/Register/Register_Picker_FamilyStructure')
	static TestObject imagepickerRegister = findTestObject('Object Repository/Authentication/Register/Register_Button_ImagePicker')
	static TestObject backarrowRegisterRegister = findTestObject('Object Repository/Authentication/Register/Register_Button_BackArrow')
	static TestObject camerabottomsheetRegister = findTestObject('Object Repository/Authentication/Register/Register_BottomSheet_Camera')
	static TestObject galerybottomsheetRegister = findTestObject('Object Repository/Authentication/Register/Register_BottomSheet_Galery')
	static TestObject nextbuttonRegister = findTestObject('Object Repository/Authentication/Register/Register_Button_Next')
	static TestObject selectBottomSheet = findTestObject('Object Repository/Authentication/Register/Register_BottomSheet_Nationality(Indonesia)')
	static TestObject passwordPage = findTestObject('Object Repository/Authentication/Register/Register_Password_Page')
	static TestObject passwordField = findTestObject('Object Repository/Authentication/Register/Register_Password_Field')
	static TestObject repasswordField = findTestObject('Object Repository/Authentication/Register/Register_Repassword_Field')
	static TestObject passwordCheckbox = findTestObject('Object Repository/Authentication/Register/Register_Password_Checkbox')
	static TestObject passwordTerms = findTestObject('Object Repository/Authentication/Register/Register_Password_Terms')
	static TestObject passwordSubmitButton = findTestObject('Object Repository/Authentication/Register/Register_Password_Next')
	static TestObject selectmethodPage = findTestObject('Object Repository/Authentication/Register/Register_Method_Page')
	static TestObject selectemailMethod = findTestObject('Object Repository/Authentication/Register/Register_Method_SelectMethod')
	static TestObject otpPage = findTestObject('Object Repository/Authentication/Register/Register_OTP_Title')
	static TestObject otpField = findTestObject('Object Repository/Authentication/Register/Register_OTP_Input')
	static TestObject otpSubmit = findTestObject('Object Repository/Authentication/Register/Register_OTP_Submit')
	static TestObject otpResend = findTestObject('Object Repository/Authentication/Register/Register_OTP_Resend')
	
}
