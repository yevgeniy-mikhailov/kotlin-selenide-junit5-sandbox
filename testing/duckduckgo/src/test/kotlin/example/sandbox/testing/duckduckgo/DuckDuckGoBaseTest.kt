package example.sandbox.testing.duckduckgo

import com.codeborne.selenide.Selenide.open
import example.sandbox.testing.test.BaseTest
import org.junit.jupiter.api.BeforeAll

abstract class DuckDuckGoBaseTest: BaseTest() {

    @BeforeAll
    fun setup() {
        open(cfg.baseUrl())
    }
}