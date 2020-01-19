package example.sandbox.testing.duckduckgo

import com.codeborne.selenide.Selenide.open
import example.sandbox.testing.test.BaseTest
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class DuckDuckGoBaseTest: BaseTest() {

    @BeforeAll
    open fun openTestedSite() {
        open(cfg.baseUrl())
    }
}