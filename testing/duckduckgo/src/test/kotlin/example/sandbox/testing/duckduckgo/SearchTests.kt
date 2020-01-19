package example.sandbox.testing.duckduckgo

import example.sandbox.testing.duckduckgo.model.MainPage
import example.sandbox.testing.duckduckgo.model.ResultPage
import org.junit.Assert
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SearchTests : DuckDuckGoBaseTest() {
    private val page = MainPage()
    val query = "Selenide"
    private var resultPage = ResultPage()

    @BeforeEach
    fun searchSelenide() {
        resultPage = page.search(query)
    }

    @Test
    fun `search input field on result page should contain searched string`() {
        Assert.assertEquals("Searched string", query, resultPage.searchInput().value)
    }

}