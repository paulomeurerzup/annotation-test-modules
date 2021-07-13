@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.android.registrar

import kotlin.Pair
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

public final object RegisteredOperationsRegistrarSample {
  public fun registeredOperations(): List<Pair<String, String>> {
    val registeredComponents = listOf<Pair<String, String>>(
       
    	Pair("""isValidCpf""","br.com.zup.beagle.sample.operations.IsValidCPFOperation"),
    )
    return registeredComponents
  }
}
