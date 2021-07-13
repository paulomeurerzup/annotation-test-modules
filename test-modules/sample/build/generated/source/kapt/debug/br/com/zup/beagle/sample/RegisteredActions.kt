@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.action.Action
import java.lang.Class
import kotlin.Suppress
import kotlin.collections.List

public final object RegisteredActions {
  public fun registeredActions(): List<Class<Action>> {
    val registeredActions = listOf<Class<Action>>(
       
    	br.com.zup.beagle.sample.actions.CustomAndroidAction::class.java as Class<Action>,
    	br.com.zup.beagle.android.modulea.ModuleAAction::class.java as Class<Action>,
    	br.com.zup.beagle.android.moduleb.ModuleBAction::class.java as Class<Action>,
    	br.com.zup.beagle.android.modulec.ModuleCAction::class.java as Class<Action>,
    )
    return registeredActions
  }
}
