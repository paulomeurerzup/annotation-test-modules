@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.android.registrar

import kotlin.Pair
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

public final object RegisteredWidgetsRegistrarSample {
  public fun registeredWidgets(): List<Pair<String, String>> {
    val registeredComponents = listOf<Pair<String, String>>(
       
    	Pair("""""","br.com.zup.beagle.sample.widgets.SampleTextField"),
    	Pair("""""","br.com.zup.beagle.sample.widgets.Text"),
    	Pair("""""","br.com.zup.beagle.sample.widgets.MutableText"),
    	Pair("""""","br.com.zup.beagle.sample.widgets.CustomPageIndicator"),
    	Pair("""""","br.com.zup.beagle.sample.widgets.TextField"),
    	Pair("""""","br.com.zup.beagle.sample.widgets.Input"),
    )
    return registeredComponents
  }
}
