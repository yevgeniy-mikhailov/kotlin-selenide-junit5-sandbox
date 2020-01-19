package example.sandbox.testing.duckduckgo.model

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.SelenideElement
import example.sandbox.testing.model.BasePage
import io.qameta.allure.Step
import org.openqa.selenium.By

class MainPage : BasePage(), HeaderMenu, Search {
    @Step("Get addToChromeButton")
    fun addToChromeButton(): SelenideElement = `$`(By.cssSelector(".js-badge-link-button"))

    @Step("Search: {0}")
    fun search(q: String): ResultPage {
        searchInput().value = q
        searchButton().click()
        return ResultPage()
    }
}