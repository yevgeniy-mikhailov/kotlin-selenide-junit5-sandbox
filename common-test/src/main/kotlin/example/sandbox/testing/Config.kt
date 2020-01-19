package example.sandbox.testing

import org.aeonbits.owner.Config

interface Config : Config {

    @Config.Key("conf.base.url")
    fun baseUrl(): String
}