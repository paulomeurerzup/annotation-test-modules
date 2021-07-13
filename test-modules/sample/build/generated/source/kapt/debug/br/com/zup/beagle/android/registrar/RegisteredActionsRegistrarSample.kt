@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.android.registrar

import kotlin.Pair
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

public final object RegisteredActionsRegistrarSample {
  public fun registeredActions(): List<Pair<String, String>> {
    val registeredComponents = listOf<Pair<String, String>>(
       
    	Pair("""""","br.com.zup.beagle.sample.actions.CustomAndroidAction"),
    )
    return registeredComponents
  }
}
