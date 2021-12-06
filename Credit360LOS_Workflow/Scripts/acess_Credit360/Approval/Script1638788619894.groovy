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

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/i_power_settings_new'))

WebUI.setText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/input_Log In_username'), 'roy-egbokhano')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/input_Log In_pasword'), 'JltEQgaE0YE=')

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Log In'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/div_No. of Loans In Pipeline'))

WebUI.navigateToUrl('http://fintrakcredit360web2.azurewebsites.net/#/credit/appraisal/credit-appraisal')

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/div_Is Subsediary_ui-radiobutton-box ui-wid_98da33_1'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/span_Application Information'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Accept'))

WebUI.setText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/textarea_CommentRecommendation_comment'), 
    'good')

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Save and Send'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Yes'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_OK'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/i_power_settings_new'))

WebUI.setText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/input_Log In_username'), 'etukudoe')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/input_Log In_pasword'), 'JltEQgaE0YE=')

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Log In'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/div_No. of Loans In Pipeline'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/div_Is Subsediary_ui-radiobutton-box ui-wid_98da33_1_2'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/span_Application Information'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Accept_1'))

WebUI.setText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/textarea_CommentRecommendation_comment'), 
    'good')

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Save and Send'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Yes'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_OK'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/i_power_settings_new'))

WebUI.setText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/input_Log In_username'), 'okebugwug')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/input_Log In_pasword'), 'JltEQgaE0YE=')

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Log In'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/div_No. of Loans In Pipeline'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/div_Is Subsediary_ui-radiobutton-box ui-wid_98da33_1_2_3'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/span_Application Information'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Accept_1'))

WebUI.setText(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/textarea_CommentRecommendation_comment'), 
    'goog')

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Save and Send'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_Yes'))

WebUI.click(findTestObject('Object Repository/Approval/Page_Fintrak  Core Banking/button_OK'))

