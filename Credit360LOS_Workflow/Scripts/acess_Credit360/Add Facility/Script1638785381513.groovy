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

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_-- Select Require Collateral --Immov_24245d'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_--- Select Product Class --- Non-Cre_941f57'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/input_Loan Amount with Other Bank_loansWithOthers'), 
    '0')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_-Select Employer-  ANGELIC CARE HOSP_39e9ec'), 
    '1882', true)

WebUI.click(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/button_Add Facility'))

WebUI.setText(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/input_Facility Amount_proposedAmount'), 
    '1000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_--Select Product-- Advance Payment G_bf3e42'), 
    '165', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_Select CRMS Funding Source FS1000-Ba_984b62'), 
    '181', true)

WebUI.setText(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/textarea_Facility Purpose_loanPurpose'), 
    'Infrastructure')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_Select Operating Account 0065688911(_049dee'), 
    '21433', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_Select Cycle  0  60  90  180  270  360'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_Select Review Type INITIAL  RENEWAL _c077c7'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_ACTIVITIES OF EXTRATERRITORIAL ORGAN_b76100'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_---Select Subsector--- Activities of_46f55c'), 
    '361', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_Select Currency Naira NGN US Dollars_7520be'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/select_Select CRMS Repayment Source GRS001-_f2eaf8'), 
    '130', true)

WebUI.click(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/button_Add Facility_1'))

WebUI.click(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/button_OK'))

WebUI.click(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/button_Save and Continue'))

WebUI.click(findTestObject('Object Repository/AddFacility/Page_Fintrak  Core Banking/button_OK'))

