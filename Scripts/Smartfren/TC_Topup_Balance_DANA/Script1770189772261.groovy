import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.WebDriver
import java.text.SimpleDateFormat

String url = 'https://1.smartfren.com/'
String unlockPassword = 'Sf_Xlsmart_123!'
String smartfrenNumber = '0882003100041'

String danaPhone = '8881850092'
String danaPin = '160190'

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.comment('1. Open Smartfren web')
WebUI.navigateToUrl(url)
WebUI.takeScreenshot()

WebUI.comment('2. Input unlock password')
WebUI.waitForElementVisible(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/input_password_unlock'), 30)
WebUI.setText(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/input_password_unlock'), unlockPassword)
WebUI.takeScreenshot()

WebUI.comment('3. Click Unlock')
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_unlock'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_unlock'))
WebUI.takeScreenshot()

WebUI.comment('4. Click menu Isi Pulsa')
WebUI.waitForPageLoad(30)
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/menu_isi_pulsa'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/menu_isi_pulsa'))
WebUI.takeScreenshot()

WebUI.comment('5. Input Smartfren number')
WebUI.waitForElementVisible(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/input_smartfren_number'), 30)
WebUI.setText(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/input_smartfren_number'), smartfrenNumber)
WebUI.takeScreenshot()

WebUI.comment('6. Click See Denom')
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_see_denom'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_see_denom'))
WebUI.takeScreenshot()

WebUI.comment('7. Choose denom Rp 20.000')
WebUI.waitForPageLoad(30)
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_denom_rp_20000'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_denom_rp_20000'))
WebUI.takeScreenshot()

WebUI.comment('8. Submit topup')
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_submit_topup'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_submit_topup'))
WebUI.takeScreenshot()

WebUI.comment('9. Open payment method dropdown')
WebUI.waitForPageLoad(30)
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/dropdown_metode_pembayaran'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/dropdown_metode_pembayaran'))
WebUI.takeScreenshot()

WebUI.comment('10. Select payment method: DANA')
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/option_dana'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/option_dana'))
WebUI.takeScreenshot()

WebUI.comment('11. Click Bayar')
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_bayar'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_bayar'))
WebUI.takeScreenshot()

WebUI.comment('12. Click Lanjutkan Pembayaran')
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_lanjutkan_pembayaran'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/Smartfren/btn_lanjutkan_pembayaran'))
WebUI.takeScreenshot()

WebUI.comment('13. Switch to new tab: DANA')
WebDriver driver = DriverFactory.getWebDriver()
long start = System.currentTimeMillis()
while (driver.getWindowHandles().size() < 2 && (System.currentTimeMillis() - start) < 30000) {
	WebUI.delay(1)
}
WebUI.switchToWindowIndex(1)
WebUI.waitForPageLoad(30)
WebUI.takeScreenshot()


WebUI.comment('14. Input DANA phone number')
WebUI.waitForElementVisible(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/input_phone'), 30)
WebUI.setText(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/input_phone'), danaPhone)
WebUI.takeScreenshot()

WebUI.comment('15. Click CONTINUE on DANA')
WebUI.waitForElementVisible(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_pay'), 30)
WebUI.scrollToElement(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_pay'), 10)
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_pay'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_pay'))
WebUI.takeScreenshot()

WebUI.comment('16. Input DANA PIN')
WebUI.waitForPageLoad(15)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/input_pin'))
WebUI.setText(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/input_pin'), danaPin)
WebUI.takeScreenshot()

WebUI.comment('17. Click final PAY button')
WebUI.waitForElementVisible(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_final_pay'), 30)
WebUI.scrollToElement(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_final_pay'), 10)
WebUI.waitForElementClickable(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_final_pay'), 30)
WebUI.click(findTestObject('Object Repository/TC_Topup_Balance_DANA/DANA/btn_final_pay'))

WebUI.delay(10)
WebUI.takeScreenshot()

WebUI.closeBrowser()
