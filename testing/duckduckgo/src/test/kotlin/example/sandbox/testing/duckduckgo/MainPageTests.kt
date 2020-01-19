package example.sandbox.testing.duckduckgo

import example.sandbox.testing.duckduckgo.model.MainPage
import org.junit.Assert
import org.junit.jupiter.api.Test

class MainPageTests : DuckDuckGoBaseTest() {
    private val page = MainPage()

    @Test
    fun `menu button should be displayed on main search page`() {
        Assert.assertTrue(page.headerMenu().isDisplayed)
    }

    @Test
    fun `add to chrome button displayed and has text = "Add DuckDuckGo to Chrome"`() {
        Assert.assertEquals("Button text", "Add DuckDuckGo to Chrome", page.addToChromeButton().text)
    }
}