import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import utils.CommonMethods as CommonMethods
import initialsObject.LoginObject
import initialsObject.RegisterObject
import initialsObject.PermissionObject
import initialsObject.GalleryObject
import initialsObject.DatePickerObject

//For change account quickly, just change value following id on test data (FormRegisterCredentials)
int idAccount = 1
TestData data = findTestData('Data Files/Auth/FormRegisterCredentials')
String fullname = data.getValue('Full Name', idAccount)
String email = data.getValue('Email', idAccount)
String phonenumber = data.getValue('Phone Number', idAccount)
String password = data.getValue('Password', idAccount)
String repassword = data.getValue('Repassword', idAccount)

// Buat instance dari CommonMethods
CommonMethods cm = new CommonMethods()

//Open App
cm.openAppDirectly()

//Verify on Login Page
Mobile.verifyElementExist(LoginObject.phonenumberField, 0)

//Click Register
Mobile.tap(LoginObject.registerButton, 0)

//Verify already on Register Page
Mobile.verifyElementExist(RegisterObject.fullnamefieldRegister, 0)

//Click Image Picker
Mobile.tap(RegisterObject.imagepickerRegister, 0)

//Select Gallery
Mobile.tap(RegisterObject.galerybottomsheetRegister, 0)
boolean isPermissionExist =  Mobile.verifyElementExist(PermissionObject.GalleryPermissionModal, 3, FailureHandling.OPTIONAL )

if (isPermissionExist) {
	//If gallery permission appear, click allow
	Mobile.tap(PermissionObject.AllowPermission, 0)
}

//Verify Gallery Picker is appear
Mobile.waitForElementPresent(GalleryObject.GalleryPickerModal, 0)

//Click first photo
Mobile.tap(GalleryObject.GalleryPickerFirstPhotos, 0)

//Verify already on imagepreview
Mobile.waitForElementPresent(GalleryObject.ImagePreview, 0)

//Click Done
Mobile.tap(GalleryObject.ImagePreview, 0)

//Verify already on Register Page
Mobile.verifyElementExist(RegisterObject.fullnamefieldRegister, 0)

//Set Full Name Field
Mobile.setText(RegisterObject.fullnamefieldRegister, fullname, 0)

//Set Email Field
Mobile.setText(RegisterObject.emaildfieldRegister, email, 0)

//Set Email Field
Mobile.setText(RegisterObject.phonenumberfieldRegister, phonenumber, 0)

//Set Gender
Mobile.tap(RegisterObject.malegenderRegister, 0)

//Set Birthday randomly
Mobile.tap(RegisterObject.birthdaypickerRegister, 0)
Mobile.tap(DatePickerObject.DatePickerHeaderYear, 0)
Mobile.scrollToText("2016")
Mobile.tap(DatePickerObject.DatePickerSelectYear, 0)
Mobile.tap(DatePickerObject.DatePickerFinalSelect, 0)

//Set Nationality
Mobile.tap(RegisterObject.nationalitypickerRegister, 0)
Mobile.tap(RegisterObject.selectBottomSheet, 0)

//Set Occupation
Mobile.tap(RegisterObject.occupationpickerRegister, 0)
Mobile.tap(RegisterObject.selectBottomSheet, 0)

//Set Family Structure
Mobile.tap(RegisterObject.familystructurepickerRegister, 0)
Mobile.tap(RegisterObject.selectBottomSheet, 0)

////Submit
//Mobile.tap(RegisterObject.nextbuttonRegister, 0)

//Verify on password page
Mobile.verifyElementExist(RegisterObject.passwordPage, 0)

//Fill Password Field
Mobile.setText(RegisterObject.passwordField, password, 0)

//Fill Repassword Field
Mobile.setText(RegisterObject.repasswordField, repassword, 0)

//Check the checkbox terms of service
Mobile.tap(RegisterObject.passwordCheckbox, 0)

//Click Next
Mobile.tap(RegisterObject.passwordSubmitButton, 0)

//Verify on Choose Method Page
Mobile.verifyElementExist(RegisterObject.selectmethodPage, 0)

//Click select email method
Mobile.tap(RegisterObject.selectemailMethod, 0)

//Verify on OTP Code
Mobile.verifyElementExist(RegisterObject.otpPage, 0)

//Input OTP Field ( Tester harus input manual kemudian klik enter )
KeywordUtil.logInfo("Silakan input OTP secara manual lalu tekan ENTER di terminal.")
Mobile.delay(30)
// Inputkan otp dibawah 30 detik

//Submit OTP
Mobile.tap(RegisterObject.otpSubmit, 0)

//Verify already on Add Address Page
Mobile.verifyElementExist(RegisterObject.addressskipbutton, 0)

//Set Label field
Mobile.setText(RegisterObject.addresstitlefield, 'timedoor', 0)

//Set Address field
Mobile.setText(RegisterObject.addressfield, 'Timedoor Indonesia', 0)

//Click Province Picker
Mobile.tap(RegisterObject.addressprovincepicker, 0)

//Select Value Province
Mobile.tap(RegisterObject.addressselectprovincePicker, 0)


























