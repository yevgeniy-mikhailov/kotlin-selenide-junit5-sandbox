package example.sandbox.testing.utils

import com.codeborne.selenide.WebDriverRunner
import io.qameta.allure.Attachment
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.TestWatcher
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import java.util.*

class TestListener : TestWatcher {
    override fun testSuccessful(context: ExtensionContext?) {
    }

    override fun testFailed(context: ExtensionContext?, cause: Throwable?) {
        val driver = WebDriverRunner.getWebDriver()
        saveScreenshotPNG(driver)
    }

    override fun testDisabled(context: ExtensionContext?, reason: Optional<String>?) {
    }

    override fun testAborted(context: ExtensionContext?, cause: Throwable?) {
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    fun saveScreenshotPNG(driver: WebDriver): ByteArray {
        return (driver as TakesScreenshot).getScreenshotAs(OutputType.BYTES)
    }
}