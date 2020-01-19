package example.sandbox.testing.test

import com.codeborne.selenide.Configuration
import example.sandbox.testing.Config
import example.sandbox.testing.utils.TestListener
import org.aeonbits.owner.ConfigFactory
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.extension.ExtendWith
import org.slf4j.LoggerFactory

@ExtendWith(TestListener::class)
abstract class BaseTest {
    companion object {
        @JvmStatic
        val cfg: Config = ConfigFactory.create(Config::class.java)
        private val log = LoggerFactory.getLogger(BaseTest::class.qualifiedName)
    }

    @BeforeAll
    fun setup() {
        Configuration.browser = "Chrome"
        Configuration.baseUrl = cfg.baseUrl()
    }
}