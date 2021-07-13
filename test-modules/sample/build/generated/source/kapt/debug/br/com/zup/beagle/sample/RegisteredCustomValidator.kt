@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.components.form.core.Validator
import br.com.zup.beagle.android.components.form.core.ValidatorHandler
import kotlin.Any
import kotlin.String
import kotlin.Suppress

public final object RegisteredCustomValidator : ValidatorHandler {
  public override fun getValidator(name: String): Validator<Any, Any>? = when(name) {
     	"nameSurname" -> br.com.zup.beagle.sample.NameSurnameValidator() as Validator<Any, Any>
  	"Charade" -> br.com.zup.beagle.sample.validators.CharadeValidator() as Validator<Any, Any>
  	"text-is-not-blank" -> br.com.zup.beagle.sample.validators.TextNotBlankValidator() as
      Validator<Any, Any>
  	"moduleAValidator" -> br.com.zup.beagle.android.modulea.ModuleAValidator() as Validator<Any, Any>
  	"moduleBValidator" -> br.com.zup.beagle.android.moduleb.ModuleBValidator() as Validator<Any, Any>
  	"moduleCValidator" -> br.com.zup.beagle.android.modulec.ModuleCValidator() as Validator<Any, Any>

     else -> null
  }

}
