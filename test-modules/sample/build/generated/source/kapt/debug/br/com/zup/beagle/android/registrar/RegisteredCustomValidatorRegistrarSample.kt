@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.android.registrar

import kotlin.Pair
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

public final object RegisteredCustomValidatorRegistrarSample {
  public fun getValidator(): List<Pair<String, String>> {
    val registeredComponents = listOf<Pair<String, String>>(
       
    	Pair("""nameSurname""","br.com.zup.beagle.sample.NameSurnameValidator"),
    	Pair("""Charade""","br.com.zup.beagle.sample.validators.CharadeValidator"),
    	Pair("""text-is-not-blank""","br.com.zup.beagle.sample.validators.TextNotBlankValidator"),
    )
    return registeredComponents
  }
}
