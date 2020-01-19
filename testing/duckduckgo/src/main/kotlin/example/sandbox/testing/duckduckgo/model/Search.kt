package example.sandbox.testing.duckduckgo.model

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import io.qameta.allure.Step
import org.openqa.selenium.By

interface Search {
    @Step("Get Search button")
    fun searchButton(): SelenideElement = `$`(By.cssSelector(".js-search-button"))

    @Step("Get Search input field")
    fun searchInput(): SelenideElement = `$`(By.cssSelector(".js-search-input"))
}