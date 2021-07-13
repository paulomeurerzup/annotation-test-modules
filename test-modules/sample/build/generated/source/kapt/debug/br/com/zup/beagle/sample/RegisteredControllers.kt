@file:Suppress("UNCHECKED_CAST")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.navigation.BeagleControllerReference
import br.com.zup.beagle.android.view.BeagleActivity
import java.lang.Class
import kotlin.String
import kotlin.Suppress

public final class RegisteredControllers : BeagleControllerReference {
  public override fun classFor(id: String?): Class<BeagleActivity> = when(id) {

      "moduleAController1" -> br.com.zup.beagle.android.modulea.ModuleAController1::class.java as
      Class<BeagleActivity>
      "moduleBController2" -> br.com.zup.beagle.android.moduleb.ModuleBController2::class.java as
      Class<BeagleActivity>
      "moduleBController3" -> br.com.zup.beagle.android.moduleb.ModuleBController3::class.java as
      Class<BeagleActivity>
      "moduleCController2" -> br.com.zup.beagle.android.modulec.ModuleCController2::class.java as
      Class<BeagleActivity>
      "moduleCController1" -> br.com.zup.beagle.android.modulec.ModuleCController1::class.java as
      Class<BeagleActivity>
      else -> br.com.zup.beagle.android.moduleb.ModuleBController1::class.java as
      Class<BeagleActivity>
  }

}
