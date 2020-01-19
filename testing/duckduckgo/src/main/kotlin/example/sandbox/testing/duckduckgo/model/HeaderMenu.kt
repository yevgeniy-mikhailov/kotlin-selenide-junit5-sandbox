package example.sandbox.testing.duckduckgo.model

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import io.qameta.allure.Step
import org.openqa.selenium.By

interface HeaderMenu {
    @Step("Get header menu button")
    fun headerMenu(): SelenideElement = `$`(By.cssSelector(".js-side-menu-open"))
}