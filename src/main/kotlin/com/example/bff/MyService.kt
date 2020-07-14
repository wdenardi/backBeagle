package com.example.bff

import br.com.zup.beagle.widget.layout.ScreenBuilder
import org.springframework.stereotype.Service

@Service
class MyService {

    fun builderScreen() = ScreenBuilderLogin().createScreenLogin()

    fun builderScreenPrimary() = ScreenBuilderPrimary().createScreenPrimary()
}
