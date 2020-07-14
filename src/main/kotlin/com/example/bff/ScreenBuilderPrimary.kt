package com.example.bff

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.SafeArea
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.TabView
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput

class ScreenBuilderPrimary {

    fun createScreenPrimary() = Screen(
            style = Style(
                    backgroundColor = "#C6C6C6"),
            safeArea = SafeArea(
                    top = true,
                    leading = true,
                    bottom = true,
                    trailing = true
            ),
            child = Container(
                    children = listOf(
                            Container(children = listOf(
                                    Text("E-mail:").applyStyle(Style(margin = EdgeValue(left = UnitValue(16.0, UnitType.REAL), top = UnitValue(16.0, UnitType.REAL), right = UnitValue(16.0, UnitType.REAL), bottom = UnitValue(4.0, UnitType.REAL))))

                                    )
                            )
                    )
            ).applyStyle
            (
                    Style
                    (
                            backgroundColor = "#C6C6C6",
                            margin = EdgeValue(left = UnitValue(32.0, UnitType.REAL), right = UnitValue(32.0, UnitType.REAL)),
                            flex = Flex(justifyContent = JustifyContent.CENTER, grow = 1.0)
                    )
            )
    )

}

