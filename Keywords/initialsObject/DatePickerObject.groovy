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

public class DatePickerObject {
	static TestObject DatePickerModal = findTestObject('Object Repository/Component/Datepicker/Datepicker_Modal')
	static TestObject DatePickerHeaderYear = findTestObject('Object Repository/Component/Datepicker/Datepicker_Header_Year')
	static TestObject DatePickerSelectYear = findTestObject('Object Repository/Component/Datepicker/Datepicker_Select_Year')
	static TestObject DatePickerFinalSelect = findTestObject('Object Repository/Component/Datepicker/DatePicker_OK_Button')
	static TestObject DatePickerCancelButton = findTestObject('Object Repository/Component/Datepicker/Datepicker_Cancel_Button')
	static TestObject DatePickerScrollable = findTestObject('Object Repository/Component/Datepicker/DatePicker_Scroll')
}
